/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjq
 */
public class cjq_2
implements adx_1<cuj_1> {
    @Override
    public boolean a(cuj_1 cuj_12) {
        String string;
        esz_2 esz_22 = cuj_12.b();
        switch (esz_22) {
            case b: {
                string = "notification.havenWorld.not.guild.member";
                break;
            }
            case c: {
                string = "notification.havenWorld.unknown.world";
                break;
            }
            case d: {
                string = "notification.havenWorld.already.opening.world";
                break;
            }
            case e: {
                string = "notification.havenWorld.already.opened.world";
                break;
            }
            case f: {
                string = "notification.havenWorld.too.many.opened.world";
                break;
            }
            case h: {
                string = "notification.havenWorld.openingText";
                break;
            }
            default: {
                string = "notification.havenWorld.unknown.opening.error";
            }
        }
        String string2 = bae.h().a(string, new Object[0]);
        dbo_0.a.a(string2, 8);
        return false;
    }

    @Override
    public int a() {
        return 14831;
    }
}

