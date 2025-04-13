/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAs
 */
public class bas_2
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bat_1());

    public bFZ a() {
        bar_1 bar_12;
        try {
            bar_12 = (bar_1)a.borrowObject();
            bar_1.a(bar_12, a);
        }
        catch (Exception exception) {
            bar_1.q.error((Object)"Error when retrieving an ArtisansBook from the pool", (Throwable)exception);
            bar_12 = new bar_1();
        }
        return bar_12;
    }

    @Override
    public /* synthetic */ abo_1 b() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.a();
    }
}

