package com.netease.nim.musiceducation.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * 混淆时必须被Keep的对象
 * <p>
 * Created by huangjun on 2017/11/20.
 */

@Retention(CLASS)
@Target({TYPE})
public @interface KeepMemberNames {
}