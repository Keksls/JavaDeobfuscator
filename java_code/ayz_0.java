/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYz
 */
public final class ayz_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 11;
    private final int l;
    private final String[] m;

    public ayz_0(int n, String ... stringArray) {
        this.m = (String[])stringArray.clone();
        this.l = n;
    }

    @Override
    public boolean a() {
        switch (this.l) {
            case 0: 
            case 1: 
            case 9: 
            case 10: {
                return this.m.length == 0;
            }
            case 3: 
            case 5: 
            case 11: {
                return this.m.length == 1;
            }
            case 2: 
            case 4: 
            case 7: 
            case 8: {
                return this.m.length == 2;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("You have to be connected to access these commands");
            return;
        }
        try {
            switch (this.l) {
                case 0: {
                    ayz_0.j();
                    break;
                }
                case 2: {
                    this.f();
                    break;
                }
                case 1: {
                    ayz_0.e();
                    break;
                }
                case 3: {
                    this.g();
                    break;
                }
                case 4: {
                    this.h();
                    break;
                }
                case 5: {
                    this.i();
                    break;
                }
                case 7: {
                    this.d();
                    break;
                }
                case 8: {
                    this.c();
                    break;
                }
                case 9: {
                    ayz_0.c(aaw_22);
                    break;
                }
                case 10: {
                    ayz_0.b(aaw_22);
                    break;
                }
                case 11: {
                    this.a(aaw_22);
                    break;
                }
                default: {
                    aVo.a().d("Unknown command " + this.l);
                    break;
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("An issue occurred during a command " + exception);
        }
    }

    private void a(aaw_2 aaw_22) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        long l = bmr_12.a_();
        byte by = Byte.parseByte(this.m[0]);
        cqG cqG2 = new cqG(l, by);
        aaw_22.c(cqG2);
    }

    private static void b(aaw_2 aaw_22) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        long l = bmr_12.a_();
        cqE cqE2 = new cqE(l);
        aaw_22.c(cqE2);
    }

    private static void c(aaw_2 aaw_22) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        long l = bmr_12.a_();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)490);
        pt.a(l);
        aaw_22.c(pt);
    }

    private void c() {
        int n = Integer.parseInt(this.m[0]);
        String string = this.m[1];
        fiL fiL2 = new fiL();
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.a_();
        if (fiL2.a(l, n)) {
            cqJ cqJ2 = new cqJ(l, n, string);
            azu_0.j().K().c(cqJ2);
            ayz_0.a("New deck : " + bmr_12.dw().b(n));
        } else {
            aVo.a().d("Modification failed, see client logs");
        }
    }

    private void d() {
        int n = Integer.parseInt(this.m[0]);
        int n2 = Integer.parseInt(this.m[1]);
        fiL fiL2 = new fiL();
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.a_();
        if (fiL2.a(l, n, n2)) {
            cqI cqI2 = new cqI(l, n, n2);
            azu_0.j().K().c(cqI2);
            ayz_0.a("New deck : " + bmr_12.dw().b(n));
        } else {
            aVo.a().d("Modification failed, see client logs");
        }
    }

    private static void e() {
        bmr_1 bmr_13 = azu_0.j().k();
        euw_2.a.b(bmr_13.U_(), bmr_12 -> {
            fiR fiR2 = bmr_12.dw();
            ayz_0.a("Deck du personnage " + bmr_12.dp() + " (" + bmr_12.a_() + ") : " + fiR2);
            return true;
        });
    }

    private void f() {
        int n;
        int n2 = Integer.parseInt(this.m[0]);
        int n3 = Integer.parseInt(this.m[1]);
        fiL fiL2 = new fiL();
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.a_();
        if (fiL2.a(l, n2, n = bmr_12.C(), n3)) {
            cqF cqF2 = new cqF(l, n2, n, n3);
            azu_0.j().K().c(cqF2);
            ayz_0.a("New deck : " + bmr_12.dz());
        } else {
            aVo.a().d("Modification failed, see client logs");
        }
    }

    private void g() {
        int n;
        int n2 = Integer.parseInt(this.m[0]);
        fiL fiL2 = new fiL();
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.a_();
        if (fiL2.b(l, n2, n = bmr_12.C())) {
            cqH cqH2 = new cqH(l, n2, n);
            azu_0.j().K().c(cqH2);
            ayz_0.a("New deck : " + bmr_12.dz());
        } else {
            aVo.a().d("Modification failed, see client logs");
        }
    }

    private void h() {
        fiO fiO2;
        int n = Integer.parseInt(this.m[0]);
        String string = this.m[1];
        fiL fiL2 = new fiL();
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.a_();
        if (fiL2.a(l, n, fiO2 = fiM.a(string))) {
            cqK cqK2 = new cqK(l, n, fiO2);
            azu_0.j().K().c(cqK2);
            ayz_0.a("New deck : " + bmr_12.dz());
        } else {
            aVo.a().d("Modification failed, see client logs");
        }
    }

    private void i() {
        fiO fiO2;
        int n = Integer.parseInt(this.m[0]);
        fiL fiL2 = new fiL();
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.a_();
        if (fiL2.a(l, n, fiO2 = new fiO())) {
            cqK cqK2 = new cqK(l, n, fiO2);
            azu_0.j().K().c(cqK2);
            ayz_0.a("New deck : " + bmr_12.dz());
        } else {
            aVo.a().d("Modification failed, see client logs");
        }
    }

    private static void j() {
        ayz_0.a("spelldeck (help | h) : displays commands descriptions");
        ayz_0.a("spelldeck (show | s) : displays current spells deck ");
        ayz_0.a("spelldeck (add | a ) spellId slotIndex: add spell to active deck at specified slot");
        ayz_0.a("spelldeck (remove | rm) spellId : remove specified spell from the decklist");
        ayz_0.a("spelldeck (key | k) deckIndex key : generate a deck with a key at specified index");
        ayz_0.a("spelldeck (reset | rs) deckIndex : reset all spells in specified deck");
        ayz_0.a("spelldeck (setDeckLevel | setLevel | sl) deckIndex level : set a level to given deck");
        ayz_0.a("spelldeck (setDeckName|setName|sn) deckIndex name : set a name to given deck");
        ayz_0.a("spelldeck (increaseSetSize|incSize|iss) : add an empty deck to the spell deck WITHOUT max size check");
        ayz_0.a("spelldeck (addDeck|ad) : add an empty deck to the leader's spell deck WITH max size check ");
        ayz_0.a("spelldeck (removeDeck|rd) deckIndex: remove deck at given to the leader's spell deck");
    }
}

