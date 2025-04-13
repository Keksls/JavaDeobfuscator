/*
 * Decompiled with CFR 0.152.
 */
public class aXU
extends aXj {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    private final byte d;
    private final String[] e;

    public aXU() {
        this(0, new String[0]);
    }

    public aXU(byte by, String ... stringArray) {
        this.d = by;
        this.e = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.d) {
            case 0: {
                return this.e.length == 0;
            }
            case 1: 
            case 2: {
                return this.e.length == 2 || this.e.length == 3 || this.e.length == 4;
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
        pt.a((byte)3);
        switch (this.d) {
            case 0: {
                aXU.c();
                break;
            }
            case 1: {
                pt.a((short)148);
                short s2 = Short.parseShort(this.e[0]);
                if (s2 <= 0 || s2 > bq_0.values().length - 1) {
                    aVo.a().d("Bad type id. Use \"reward help\" to check which type can be used ! ");
                    return;
                }
                pt.b((short)(s2 + 1));
                pt.a(Integer.parseInt(this.e[1]));
                if (this.e.length >= 3) {
                    pt.a(Long.parseLong(this.e[2]));
                }
                if (this.e.length >= 4) {
                    pt.a(Long.parseLong(this.e[3]));
                }
                aaw_22.c(pt);
                break;
            }
            case 2: {
                pt.a((short)58);
                pt.a(Integer.parseInt(this.e[0]));
                pt.a(Integer.parseInt(this.e[1]));
                if (this.e.length >= 3) {
                    pt.a(Long.parseLong(this.e[2]));
                }
                if (this.e.length >= 4) {
                    pt.a(Long.parseLong(this.e[3]));
                }
                aaw_22.c(pt);
            }
        }
    }

    private static void c() {
        aVo.a().a("reward :");
        aVo.a().a("reward help | h : show this documentation");
        aVo.a().a("reward add | a <type> <quantity> : add reward to local player");
        aVo.a().a("reward add | a <type> <quantity> <accountId> : add reward to account - can be consume by any character");
        aVo.a().a("reward add | a <type> <quantity> <accountId> <characterId> : add reward to character - /!\\ Be careful to use the right account id, or the reward will be lost in the interstellar vacuum");
        aVo.a().a("reward addItem | ai <refId> <quantity> : add item to local player");
        aVo.a().a("reward addItem | ai <refId> <quantity> <accountId> : add item to account - can be consume by any character");
        aVo.a().a("reward addItem | ai <refId> <quantity> <accountId> <characterId> : add item to character - /!\\ Be careful to use the right account id, or the reward will be lost in the interstellar vacuum");
        aVo.a().a("type :\n   1 = xp\n   2 = merit (pvp score)\n   3 = glory orb (pvp money)\n   4 = kama");
    }
}

