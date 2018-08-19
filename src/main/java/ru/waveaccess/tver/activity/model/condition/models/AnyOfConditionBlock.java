package ru.waveaccess.tver.activity.model.condition.models;

import ru.waveaccess.tver.activity.model.condition.Condition;

import java.util.List;

//OR operator for conditions, for example "3 of possible places check"
public class AnyOfConditionBlock extends Condition {

    List<Condition> conditions;
}
