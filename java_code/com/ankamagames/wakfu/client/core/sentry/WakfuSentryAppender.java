/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.sentry.Sentry
 *  io.sentry.config.Lookup
 *  io.sentry.environment.SentryEnvironment
 *  io.sentry.event.EventBuilder
 *  io.sentry.event.interfaces.DebugMetaInterface
 *  io.sentry.event.interfaces.DebugMetaInterface$DebugImage
 *  io.sentry.event.interfaces.SentryInterface
 *  io.sentry.log4j.SentryAppender
 *  org.apache.log4j.spi.LoggingEvent
 *  org.apache.log4j.spi.ThrowableInformation
 */
package com.ankamagames.wakfu.client.core.sentry;

import io.sentry.Sentry;
import io.sentry.config.Lookup;
import io.sentry.environment.SentryEnvironment;
import io.sentry.event.EventBuilder;
import io.sentry.event.interfaces.DebugMetaInterface;
import io.sentry.event.interfaces.SentryInterface;
import io.sentry.log4j.SentryAppender;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;

public class WakfuSentryAppender
extends SentryAppender {
    private static final String IO_SENTRY_PROGUARD_UUIDS = "io.sentry.ProguardUuids";
    private String m_cachedProguardUuid;

    protected EventBuilder createEventBuilder(LoggingEvent loggingEvent) {
        if (!cbf_2.c()) {
            return null;
        }
        cbf_2.d();
        EventBuilder eventBuilder = super.createEventBuilder(loggingEvent);
        WakfuSentryAppender.addFingerPrints(loggingEvent, eventBuilder);
        this.addProguardInterface(eventBuilder);
        return eventBuilder;
    }

    protected void append(LoggingEvent loggingEvent) {
        if (!SentryEnvironment.isManagingThread()) {
            SentryEnvironment.startManagingThread();
            try {
                EventBuilder eventBuilder = this.createEventBuilder(loggingEvent);
                if (eventBuilder == null) {
                    return;
                }
                Sentry.capture((EventBuilder)eventBuilder);
            }
            catch (Exception exception) {
                this.getErrorHandler().error("An exception occurred while creating a new event in Sentry", exception, 1);
            }
            finally {
                SentryEnvironment.stopManagingThread();
            }
        }
    }

    private static void addFingerPrints(LoggingEvent loggingEvent, EventBuilder eventBuilder) {
        if (loggingEvent == null) {
            return;
        }
        if (eventBuilder == null) {
            return;
        }
        ThrowableInformation throwableInformation = loggingEvent.getThrowableInformation();
        if (throwableInformation == null) {
            return;
        }
        Throwable throwable = throwableInformation.getThrowable();
        if (!(throwable instanceof alc_2)) {
            return;
        }
        alc_2 alc_22 = (alc_2)((Object)throwable);
        eventBuilder.withFingerprint(alc_22.c());
    }

    private void addProguardInterface(EventBuilder eventBuilder) {
        String string = this.getProguardUuid();
        if (string.isEmpty()) {
            return;
        }
        DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
        debugMetaInterface.addDebugImage(new DebugMetaInterface.DebugImage(string));
        eventBuilder.withSentryInterface((SentryInterface)debugMetaInterface);
    }

    private String getProguardUuid() {
        if (this.m_cachedProguardUuid != null) {
            return this.m_cachedProguardUuid;
        }
        String string = Lookup.lookup((String)IO_SENTRY_PROGUARD_UUIDS);
        this.m_cachedProguardUuid = string != null ? string : "";
        return this.m_cachedProguardUuid;
    }
}

