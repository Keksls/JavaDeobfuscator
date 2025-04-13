/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.List;

/*
 * Renamed from aWV
 */
public final class awv_0
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
    private static final short[] j = new short[0];
    private final int k;
    private final List<Integer> l;
    private final String[] m;

    public awv_0(int n) {
        this.k = n;
        this.l = null;
        this.m = null;
    }

    public awv_0(int n, String ... stringArray) {
        this.k = n;
        this.m = stringArray;
        this.l = null;
    }

    public awv_0(int n, List<Integer> list) {
        this.k = n;
        this.l = list;
        this.m = null;
    }

    public awv_0(int n, List<Integer> list, String ... stringArray) {
        this.k = n;
        this.l = list;
        this.m = stringArray;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Requires to be connected!");
            return;
        }
        try {
            switch (this.k) {
                case 0: {
                    awv_0.k();
                    break;
                }
                case 1: {
                    this.j();
                    break;
                }
                case 2: {
                    this.h();
                    break;
                }
                case 3: {
                    this.i();
                    break;
                }
                case 4: {
                    awv_0.g();
                    break;
                }
                case 5: {
                    this.f();
                    break;
                }
                case 6: {
                    this.e();
                    break;
                }
                case 7: {
                    this.d();
                    break;
                }
                case 8: {
                    this.c();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Command error " + exception);
        }
    }

    private void c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            aVo.a().d("No local player !");
            return;
        }
        fk_2 fk_22 = bol_1.a(bmr_12.R(), bmr_12.a_(), ft_1.c);
        if (fk_22.c() != 0) {
            awv_0.a("Equipped costume : " + fk_22);
        } else {
            awv_0.a("No equipped costume");
        }
    }

    private void d() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Requires to be connected!");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)461);
        pt.a(7);
        if (this.m != null && this.m.length >= 1) {
            String string2 = this.m[0];
            if (string2 == null) {
                awv_0.c("Error while parsing command to remove cosmetic");
                return;
            }
            pt.a(Integer.parseInt(string2));
            aaw_22.c(pt);
        } else {
            fzn_0 fzn_02 = new fzn_0(102, 0, "You are about to delete ALL the cosmetics of this account. Do you really wish to proceed ?", 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a((int n, String string) -> {
                if (n == 8) {
                    aaw_22.c(pt);
                }
            });
        }
    }

    private void e() {
        bmr_1 bmr_13 = azu_0.j().k();
        euw_2.a.b(bmr_13.U_(), bmr_12 -> {
            this.a((bmr_1)bmr_12);
            return true;
        });
    }

    private void a(bmr_1 bmr_12) {
        awv_0.a(bmr_12.dp() + ", id = " + bmr_12.a_());
        bHi bHi2 = bmr_12.da();
        TLongObjectIterator<exg_2> tLongObjectIterator = bHi2.i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            awv_0.a("Pos : " + exg_22.e() + ", uid : " + exg_22.f());
        }
    }

    private void f() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Requires to be connected!");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)461);
        pt.a(5);
        pt.a(Integer.parseInt(this.m[0]));
        pt.a(Integer.parseInt(this.m[1]));
        aaw_22.c(pt);
    }

    private static void g() {
        bmr_1 bmr_13 = azu_0.j().k();
        euw_2.a.b(bmr_13.U_(), bmr_12 -> {
            awv_0.b(bmr_12);
            return true;
        });
    }

    private static void b(bmr_1 bmr_12) {
        awv_0.a(bmr_12.dp() + "'s inventory");
        bHi bHi2 = bmr_12.da();
        TLongObjectIterator<exg_2> tLongObjectIterator = bHi2.i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            awv_0.a(exg_22.toString());
            for (exk_2 exk_22 : exg_22) {
                awv_0.a(" \t" + exk_22);
            }
        }
    }

    private void h() {
        short[] sArray;
        awv_0.a(2);
        bmr_1 bmr_12 = azu_0.j().k();
        long l = this.m == null ? bmr_12.a_() : (this.m.length <= 0 ? bmr_12.a_() : (Long.parseLong(this.m[0]) <= 0L ? bmr_12.a_() : Long.parseLong(this.m[0])));
        byte by = this.m != null && this.m.length > 1 ? (byte)Byte.parseByte(this.m[1]) : (byte)-1;
        short[] sArray2 = sArray = this.l != null ? new short[this.l.size()] : j;
        if (this.l != null) {
            int n = this.l.size();
            for (int k = 0; k < n; ++k) {
                sArray[k] = this.l.get(k).shortValue();
            }
        }
        cnP cnP2 = new cnP(l, by, sArray);
        aaw_2 aaw_22 = azu_0.j().K();
        aaw_22.c(cnP2);
    }

    private void i() {
        if (this.m == null || this.m[0] == null) {
            awv_0.a(3);
        } else {
            long l = Long.parseLong(this.m[0]);
            Pt pt = new Pt();
            pt.a((byte)3);
            pt.a((short)461);
            pt.a(3);
            pt.a(l);
            awv_0.a(pt);
        }
    }

    private void j() {
        if (this.m == null || this.m[0] == null) {
            awv_0.a(1);
        } else {
            long l = Long.parseLong(this.m[0]);
            Pt pt = new Pt();
            pt.a((byte)3);
            pt.a((short)461);
            pt.a(1);
            pt.a(l);
            awv_0.a(pt);
        }
    }

    private static void k() {
        awv_0.a("(help | h) : show full documentation");
        awv_0.a("(empty | e) : delete full inventory (except quest inventory)");
        awv_0.a("(empty | e) characterId : delete full inventory (except quest inventory) of an hero");
        awv_0.a("(repack | rp) : automatic sort of inventory");
        awv_0.a("(repack | rp) (typeof item id list) : automatic sort with priority. ex : inv rp  100 106 226 will sort weapons first then consumables then resources. The rest will be sorted with default param");
        awv_0.a("(repackHero | rph) heroId (typeof item id list): same one but only for an hero.");
        awv_0.a("(repackBag | rpb) bagPos (typeof item id list): same one but only for a bag.");
        awv_0.a("(shuffle | s) : Shuffle items");
        awv_0.a("(shuffle | s) characterId : Shuffle items of an hero");
        awv_0.a("(describe | desc) : show text of inventory");
        awv_0.a("(showBagsUid | sbu) : show text of bags uid");
        awv_0.a("(removeRefItem | rri) refId qty : destroy qty of specified item. qty < 0 to destroy all");
        awv_0.a("(removeCosmetic | rc) refID : Remove known cosmetic from id or emote/title based on scroll id");
        awv_0.a("(removeCosmetics) : Remove all known cosmetics");
        awv_0.a("(checkCostume) : Display costume info if one is equiped on current character");
    }

    private static void a(int n) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)461);
        pt.a(n);
        awv_0.a(pt);
    }

    private static void a(Pt pt) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        aaw_22.c(pt);
    }
}

