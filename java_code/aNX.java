/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class aNX
extends ZV {
    private static final Logger a = Logger.getLogger(aNX.class);

    @Override
    protected final void b() {
        any_0[] any_0Array;
        for (any_0 any_02 : any_0Array = any_0.values()) {
            aaq_0 aaq_02 = any_0.a(any_02);
            if (aaq_02 == null) {
                aaq_02 = this.a(any_02);
            }
            if (aaq_02 == null) continue;
            if (aaq_02.d_() != any_02.b()) {
                a.error((Object)("type incorrect pour le model " + aaq_02.getClass().getSimpleName() + " " + any_02.name()));
                continue;
            }
            this.a(aaq_02);
        }
    }

    protected abstract aaq_0 a(any_0 var1);
}

