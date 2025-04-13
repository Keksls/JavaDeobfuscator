/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWo
 */
public class awo_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private final int i;
    private final String[] j;

    public awo_0(int n, String ... stringArray) {
        this.i = n;
        this.j = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.i) {
            case 0: 
            case 5: {
                return this.j.length == 0;
            }
            case 3: 
            case 4: 
            case 6: {
                return this.j.length == 1;
            }
            case 1: 
            case 7: {
                return this.j.length == 0 || this.j.length == 1;
            }
            case 2: {
                return this.j.length == 1 || this.j.length == 2;
            }
        }
        return false;
    }

    @Override
    public void b() {
        if (this.i != 0 && this.i != 1) {
            this.d();
            return;
        }
        this.c();
    }

    void c() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)6);
        switch (this.i) {
            case 0: {
                awo_0.e();
                break;
            }
            case 1: {
                pt.a((short)498);
                if (this.j.length > 0) {
                    pt.a(Integer.parseInt(this.j[0]));
                    break;
                }
                pt.a(-1);
                break;
            }
            case 4: {
                pt.a((short)10);
                pt.a(Long.parseLong(this.j[0]));
                break;
            }
            case 5: {
                pt.a((short)293);
                break;
            }
            case 6: {
                pt.a((short)262);
                pt.a(Integer.parseInt(this.j[0]));
                break;
            }
            case 7: {
                pt.a((short)184);
                if (this.j.length <= 0) break;
                pt.b(Byte.parseByte(this.j[0]));
                break;
            }
            case 3: {
                pt.a((short)153);
                pt.b(Byte.parseByte(this.j[0]));
                break;
            }
            case 2: {
                pt.a((short)386);
                pt.a(Integer.parseInt(this.j[0]));
                if (this.j.length <= 1) break;
                pt.b(Byte.parseByte(this.j[1]));
            }
        }
        aaw_22.c(pt);
    }

    private void d() {
        fzn_0 fzn_02 = new fzn_0(102, 0, "Do you have a developer agreement for this command ?", 24L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new awp_0(this));
    }

    private static void e() {
        awo_0.a("Syntax: dungeonLadder | dl <command> : /!\\ ASK TO A DEV BEFORE /!\\ any command which isn't help or info");
        awo_0.a("(help | h) : show help");
        awo_0.a("(info) [dungeon_id] : show information about dungeon ladder, or for a specific dungeon if specified");
        awo_0.a("(reset_dungeon | rd) <dungeonId> :  clear ladder for a dungeon");
        awo_0.a("(recompute_ladder | rl) <recompute_type> : start ladder recompute, put 0 for full recompute, 1 for the recomputeAllTimeLadder from LAST_MONTH only");
        awo_0.a("(delete_entry | de) <team_id> : delete the ladder entry for specified teamId");
        awo_0.a("(disable) : disable ladder for whole dungeons");
        awo_0.a("(disable_dungeon | dd) <dungeon_id> : disable ladder for a dungeon");
        awo_0.a("(reload_from_database | rfd) : reload the ladder from the database");
    }
}

