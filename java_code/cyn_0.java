/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from cYn
 */
public class cyn_0
extends cuv_0 {
    private static final cyn_0 c = new cyn_0();

    public static cyn_0 d() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18330: {
                dgk_0 dgk_02 = (dgk_0)adt_12;
                int n = dgk_02.c();
                this.a(dgk_02.k(), dgk_02.h(), n == 0 ? -1 : n);
                return false;
            }
        }
        return super.a(adt_12);
    }

    @Override
    protected String c() {
        return "effectAreaDetailDialog";
    }

    @Override
    public void a(int n, int n2, short s2) {
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.b.get(n);
        if (tIntObjectHashMap == null) {
            return;
        }
        bot_0 bot_02 = (bot_0)tIntObjectHashMap.get(n2);
        if (bot_02 == null) {
            return;
        }
        bot_02.a(s2);
        fis_1.a().a("describedState", (Object)bot_02, this.a(bot_02.b()));
        fis_1.a().a("describedStateLevel", (Object)bot_02.c(), this.a(bot_02.b()));
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            super.a(aav_22, bl);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            super.b(aav_22, bl);
            cgu_2.a().b(this);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

