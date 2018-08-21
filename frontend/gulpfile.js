var gulp = require("gulp");
var sass = require('gulp-sass');
var clean = require('gulp-clean');
var livereload = require('gulp-livereload');
var nodemon = require('gulp-nodemon');
var uglify = require('gulp-uglify');
var runSequence = require('run-sequence');
var gutil = require('gulp-util');
var concat = require('gulp-concat');
var cleanCSS = require('gulp-clean-css');
var rename = require("gulp-rename");
var compass = require('gulp-compass');
var rev = require('gulp-rev');
var revReplace = require('gulp-rev-replace');
var paths = require('./filePaths');

gulp.task('compass', function() {
    return gulp.src('./resources/htdocs/sass')
        .pipe(compass({
            css: './resources/htdocs/css',
            sass: './resources/htdocs/sass',
            image: './resources/htdocs/img'
        }).on('error', sass.logError))
        .pipe(gulp.dest('./resources/htdocs/css'));
});

gulp.task('minify-css', function() {
    return gulp.src('./resources/htdocs/css/**/*.css')
        .pipe(cleanCSS())
        .pipe(gulp.dest('./dist/htdocs/css/'));
});

gulp.task('compress:pages', function() {
    return gulp.src(paths.pages)
        .pipe(concat('pages.js'))
        .pipe(gulp.dest('./dist/htdocs/js/lib/'))
        .pipe(uglify())
        .on('error', function (err) { gutil.log(gutil.colors.red('[Error]'), err.toString()); })
        .pipe(rename(function(path) {
            path.basename += '-min';
        }))
        .pipe(gulp.dest('./dist/htdocs/js/lib/'))
});

gulp.task('compress:directives', function() {
    return gulp.src(paths.directives)
        .pipe(concat('directives.js'))
        .pipe(gulp.dest('./dist/htdocs/js/lib/'))
        .pipe(uglify())
        .on('error', function (err) { gutil.log(gutil.colors.red('[Error]'), err.toString()); })
        .pipe(rename(function(path) {
            path.basename += '-min';
        }))
        .pipe(gulp.dest('./dist/htdocs/js/lib/'))
});

gulp.task('compress:single', function() {
    return gulp.src(paths.single)
        .pipe(concat('single.js'))
        .pipe(gulp.dest('./dist/htdocs/js/lib/'))
        .pipe(uglify())
        .on('error', function (err) { gutil.log(gutil.colors.red('[Error]'), err.toString()); })
        .pipe(rename(function(path) {
            path.basename += '-min';
        }))
        .pipe(gulp.dest('./dist/htdocs/js/lib/'))
});

gulp.task('compress:single-dev', function() {
    return gulp.src(paths.single)
        .pipe(concat('single.js'))
        .pipe(rename(function(path) {
            path.basename += '-min';
        }))
        .pipe(gulp.dest('./resources/htdocs/js/lib/'))
});

gulp.task('lazyLoadScripts', function() {
    // returns a Node.js stream, but no handling of error messages
    return gulp.src(paths.lazyLoadFiles)
        .pipe(gulp.dest('./dist/htdocs/js/lib/'))
        .pipe(uglify())
        .on('error', function (err) { gutil.log(gutil.colors.red('[Error]'), err.toString()); })
        .pipe(rename(function(path) {
            path.basename += '-min';
        }))
        .pipe(gulp.dest('./dist/htdocs/js/lib/'))
});
gulp.task('scripts', function() {
    return gulp.src('./resources/htdocs/js/js/**/*.js')
        .pipe(gulp.dest('./dist/htdocs/js/js/'))
        .pipe(uglify())
        .on('error', function (err) { gutil.log(gutil.colors.red('[Error]'), err.toString()); })
        .pipe(gulp.dest('./dist/htdocs/js/js/'))
});

gulp.task('compress', ['compress:pages', 'compress:directives', 'compress:single'], function(callback){
    callback();
});

gulp.task("hash:manifest", function() {
    return gulp.src(["./dist/htdocs/css/**/*.css", "./dist/htdocs/tpl/**/*.html", "./dist/htdocs/js/**/*.js"], {base: './dist/htdocs/'})
        .pipe(rev())
        .pipe(gulp.dest("./dist/htdocs"))
        .pipe(rev.manifest("manifest.json"))
        .pipe(gulp.dest("./"))
});

gulp.task("hash:replace", ["hash:manifest"], function(){
    var manifest = gulp.src("./manifest.json");

    return gulp.src(["./dist/server/views/*.pug", "./dist/htdocs/tpl/**/*.html", "./dist/htdocs/js/**/*.js",
            "!./dist/htdocs/js/lib/angular-1-4-9/angular.min*.js",
            "!./dist/htdocs/js/lib/html5shiv/html5shiv.min*.js",
            "!./dist/htdocs/js/lib/jquery/jquery-1.11.1.min*.js",
            "!./dist/htdocs/js/lib/respond/respond.min*.js",
            "!./dist/htdocs/js/lib/media-match*.js",
            "!./dist/htdocs/js/lib/oclazyload*.js",
            "!./dist/htdocs/js/lib/single*.js"],
            {base: './dist/htdocs/'})
        .pipe(revReplace({
            manifest: manifest,
            replaceInExtensions: ['.js', '.css', '.html', '.pug']
        }))
        .pipe(gulp.dest('./dist/htdocs'));
});

gulp.task('removeBundleMinJS', function () {
    return gulp.src(['./resources/htdocs/js/lib/single-min.js'])
        .pipe(clean({force: true}));
});

gulp.task('cleanDist', function() {
    return gulp.src('./dist/')
        .pipe(clean({force: true}));
});

gulp.task('copy:rootFile', function() {
    return gulp.src(['./gulpfile.js', './package.json'])
        .pipe(gulp.dest('./dist/'));
});
gulp.task('copy:server', function() {
    return gulp.src('./resources/server/**/*')
        .pipe(gulp.dest('./dist/server/'));
});
gulp.task('copy:fonts', function() {
    return gulp.src('./resources/htdocs/fonts/**/*')
        .pipe(gulp.dest('./dist/htdocs/fonts/'));
});
gulp.task('copy:tpl', function() {
    return gulp.src('./resources/htdocs/tpl/**/*')
        .pipe(gulp.dest('./dist/htdocs/tpl/'));
});
gulp.task('copy:lib', function() {
    return gulp.src(paths.libs, {base: './resources/htdocs/js/lib'})
        .pipe(uglify())
        .pipe(gulp.dest('./dist/htdocs/js/lib/'));
});
gulp.task('copy:img', function() {
    return gulp.src('./resources/htdocs/img/**/*')
        .pipe(gulp.dest('./dist/htdocs/img/'));
});
gulp.task('copy:data', function() {
    return gulp.src('./resources/htdocs/js/data/**/*')
        .pipe(gulp.dest('./dist/htdocs/js/data'));
});
gulp.task('copy', ['copy:rootFile', 'copy:server', 'copy:fonts', 'copy:tpl', 'copy:lib', 'copy:img', 'copy:data'], function(callback) {
    callback();
});

gulp.task('default', function() {
     runSequence(
         'cleanDist',
         ['compress', 'scripts', 'lazyLoadScripts', 'compass'],
         'minify-css',
         'copy',
         'hash:replace'
    );
});

gulp.task('build-dev', function() {
    runSequence(
        'removeBundleMinJS',
        'compress:single-dev',
        'compass'
    );
});

gulp.task('watchJs', function() {
    return gulp.src(paths.scripts)
        .pipe(livereload())
});

gulp.task('watch', function() {
    gulp.watch('./htdocs/**/*.scss', ['compass']);
    gulp.watch(paths.scripts, ['watchJs']);
    gulp.watch(paths.pages, ['compress:pages']);
    gulp.watch(paths.directives, ['compress:directives']);
    gulp.watch(paths.single, ['compress:single']);
    nodemon({
        "ignore": [".git", "node_modules"],
        "script": "./resources/server/main.js",
        "watch": ["./resources"],
        "ext": "js pug html"
    }).on('restart', function () {
        livereload.reload();
    });
});