/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from daA
 */
public class daa_0
implements ahr_1 {
    private static final daa_0 a = new daa_0();

    private daa_0() {
    }

    public static daa_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        azu_0 azu_02 = azu_0.j();
        switch (adt_12.a()) {
            case 16582: {
                if (!azu_02.c(cwu_0.h())) {
                    azu_02.a(cwu_0.h());
                }
                return false;
            }
            case 16220: {
                if (azu_02.c(cwu_0.h())) {
                    azu_02.b(cwu_0.h());
                } else {
                    azu_02.a(cwu_0.h());
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cgu_2.a().b(this);
        }
    }
}

