/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bvp
 */
public class bvp_2 {
    private static final Logger a = Logger.getLogger(bvp_2.class);

    private bvp_2() {
    }

    public static String a(@NotNull eLo eLo2) {
        if (eLo2.j()) {
            return eLo2.b();
        }
        String string = "calendar.events.predefined.title." + eLo2.e() + "." + eLo2.n();
        return bae.h().a(string, new Object[0]);
    }

    public static String b(@NotNull eLo eLo2) {
        if (eLo2.j()) {
            return eLo2.c();
        }
        String string = "calendar.events.predefined.desc." + eLo2.e() + "." + eLo2.n();
        return bae.h().a(string, new Object[0]);
    }
}

