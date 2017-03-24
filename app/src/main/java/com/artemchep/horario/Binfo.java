/*
 * Copyright (C) 2017 XJSHQ@github.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package com.artemchep.horario;

import android.support.annotation.NonNull;

/**
 * Contains a number of build constants mostly redirected from
 * the {@link BuildConfig build config}.
 *
 * @author Artem Chepurnoy
 */
@SuppressWarnings("PointlessBooleanExpression")
public final class Binfo {

    /**
     * Defines if the current build <b>debug</b> or not.
     */
    public static final boolean DEBUG = BuildConfig.MY_DEBUG;

    /**
     * Public key of my dev account in Google Play.
     */
    @NonNull
    public static final String GOOGLE_PLAY_PUBLIC_KEY =
            BuildConfig.MY_GOOGLE_PLAY_PUBLIC_KEY;

    @NonNull
    public static final String GOOGLE_API_TOKEN =
            "402207257172-8bap2v8n0ct8iis0kbpoj2cgim3pm4ao.apps.googleusercontent.com";

    /**
     * The official e-mail for tons of complains, billions of
     * "How to uninstall?" screams and one or two useful emails.
     */
    @NonNull
    public static final String SUPPORT_EMAIL =
            "support@artemchep.com";

}