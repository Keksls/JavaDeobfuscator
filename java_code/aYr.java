/*
 * Decompiled with CFR 0.152.
 */
public class aYr
extends aXj {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    private final int d;
    private final long e;
    private final int f;
    private final String g;

    public aYr(int n) {
        this(n, 0L, 0, "");
    }

    public aYr(int n, long l, int n2, String string) {
        this.d = n;
        this.e = l;
        this.f = n2;
        this.g = string;
    }

    @Override
    public boolean a() {
        switch (this.d) {
            case 2: 
            case 4: {
                return true;
            }
            case 1: {
                return this.f > 0;
            }
        }
        return false;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 1: {
                aaw_2 aaw_22 = azu_0.j().K();
                if (aaw_22 == null) {
                    aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
                    return;
                }
                Pt pt = new Pt();
                pt.a((byte)3);
                pt.a((short)159);
                pt.a(this.f);
                pt.a(this.g);
                aaw_22.c(pt);
                break;
            }
            case 2: {
                aVo.a().b("shard (createItem|ci) refId : create item with 4 white shard slots");
                aVo.a().b("shard (createItem|ci) refId slotsColor : create item with specifiedSlots : \"1_2_3_4\"");
                aVo.a().b("shard restore itemUid : restore former slots");
                aVo.a().b("shard test");
                break;
            }
            case 4: {
                aaw_2 aaw_23 = azu_0.j().K();
                if (aaw_23 == null) {
                    aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
                    return;
                }
                Pt pt = new Pt();
                pt.a((byte)3);
                pt.a((short)210);
                aaw_23.c(pt);
                break;
            }
        }
    }

    public int c() {
        return this.f;
    }
}

