/*
 * RUNESCAPE PRIVATE SERVER FRAMEWORK
 * 
 * This file is part of the Hyze Server
 *
 * Hyze is a private RuneScape server focused primarily on
 * in the Brazilian community. The project has only 1 developer
 *
 * Objective of the project is to bring the best content, performance ever seen
 * by brazilians players in relation to private RuneScape servers (RSPS).
 */

package com.hyze.events


/**
 * DESCRIPTION
 *
 * @author var_5
 * @date 30/07/2020 at 15:57
 */

@Target(AnnotationTarget.FUNCTION)
annotation class EventHandler(val priority: EventPriority = EventPriority.NORMAL)