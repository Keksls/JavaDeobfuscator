/*
 * Decompiled with CFR 0.152.
 */
public class aXh
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;
    private final int o;
    private final Object[] p;

    public aXh(int n, Object ... objectArray) {
        this.o = n;
        this.p = objectArray;
    }

    @Override
    public boolean a() {
        switch (this.o) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 9: 
            case 10: 
            case 12: 
            case 13: {
                return true;
            }
            case 4: {
                return this.p.length >= 1 && (Integer)this.p[0] > 0;
            }
            case 5: {
                if (this.p.length < 4) {
                    return false;
                }
                if ((Integer)this.p[0] <= 0) {
                    return false;
                }
                if ((Integer)this.p[1] < 0 || (Integer)this.p[1] > 4) {
                    return false;
                }
                if ((Long)this.p[2] < 0L) {
                    return false;
                }
                return (Integer)this.p[3] >= -1;
            }
            case 6: {
                return this.p.length >= 2 && (Integer)this.p[0] > 0 && (Integer)this.p[1] >= -1;
            }
            case 7: 
            case 8: {
                return this.p.length >= 1 && (Long)this.p[0] > 0L;
            }
            case 11: {
                return this.p.length >= 1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        switch (this.o) {
            case 0: {
                aXh.c();
                break;
            }
            case 1: {
                pt.a((byte)3);
                pt.a((short)286);
                aaw_22.c(pt);
                break;
            }
            case 2: {
                pt.a((byte)6);
                pt.a((short)157);
                pt.a(false);
                aaw_22.c(pt);
                break;
            }
            case 3: {
                pt.a((byte)6);
                pt.a((short)157);
                pt.a(true);
                aaw_22.c(pt);
                break;
            }
            case 4: {
                pt.a((byte)6);
                pt.a((short)317);
                pt.a((Integer)this.p[0]);
                aaw_22.c(pt);
                break;
            }
            case 5: {
                pt.a((byte)6);
                pt.a((short)174);
                pt.a((Integer)this.p[0]);
                pt.a((Integer)this.p[1]);
                pt.a((Long)this.p[2]);
                pt.a((Integer)this.p[3]);
                aaw_22.c(pt);
                break;
            }
            case 6: {
                pt.a((byte)6);
                pt.a((short)43);
                pt.a((Integer)this.p[0]);
                pt.a((Integer)this.p[1]);
                aaw_22.c(pt);
                break;
            }
            case 7: {
                pt.a((byte)6);
                pt.a((short)192);
                pt.a((Long)this.p[0]);
                aaw_22.c(pt);
                break;
            }
            case 8: {
                pt.a((byte)6);
                pt.a((short)137);
                pt.a((Long)this.p[0]);
                aaw_22.c(pt);
                break;
            }
            case 9: {
                pt.a((byte)3);
                pt.a((short)395);
                aaw_22.c(pt);
                break;
            }
            case 10: {
                pt.a((byte)6);
                pt.a((short)250);
                aaw_22.c(pt);
                break;
            }
            case 11: {
                pt.a((byte)6);
                pt.a((short)420);
                pt.a((Boolean)this.p[0]);
                aaw_22.c(pt);
                break;
            }
            case 12: {
                pt.a((byte)6);
                pt.a((short)181);
                aaw_22.c(pt);
                break;
            }
            case 13: {
                pt.a((byte)6);
                pt.a((short)196);
                fzm_0 fzm_02 = fpm_0.b().a(new fzn_0(102, 0, "Are you sure you want to run this command ?", 24L));
                fzm_02.a((n, string) -> {
                    if (n == 8) {
                        aaw_22.c(pt);
                    }
                });
            }
        }
    }

    private static void c() {
        aXh.a("=== General");
        aXh.a("market help : show help");
        aXh.a("market ping : display the most recent ping values");
        aXh.a("market maintenance : indicates whether the market server is in maintenance mode");
        aXh.a("market maintenance &lt;true|false&gt; : activate/deactivate the market server maintenance mode");
        aXh.a("market mon : returns information about the market server");
        aXh.a("=== Prices");
        aXh.a("market (prices refresh | pref) : resend the cached prices to the moderator");
        aXh.a("market (prices reload | prel) : reload the prices from the market server, cache them, and sends them to the moderator");
        aXh.a("market (prices get | pg) &lt;item id&gt; : display all the prices of the item");
        aXh.a("market (prices set | ps) &lt;item id&gt; &lt;slot count&gt; &lt;price&gt; : set the price of the item with the slot count (a reload is necessary afterwards to update the prices)");
        aXh.a("market (prices set | ps) &lt;item id&gt; &lt;slot count&gt; &lt;price&gt; &lt;sold count&gt; : set the price of the item with the slot count and the sold count (a reload is necessary afterwards to update the prices)");
        aXh.a("market (prices delete | pd) &lt;item id&gt; : delete all prices of the item (a reload is necessary afterwards to update the prices)");
        aXh.a("market (prices delete | pd) &lt;item id&gt; &lt;slot count&gt; : delete the price of the item with the slot count (a reload is necessary afterwards to update the prices)");
        aXh.a("=== Blacklist");
        aXh.a("market (blacklist | bl) : display the accounts currently in the market blacklist");
        aXh.a("market (blacklist add | bla) &lt;acc id&gt; : add an account to the market blacklist");
        aXh.a("market (blacklist remove | blr) &lt;acc id&gt; : remove an account from the market blacklist");
    }
}

