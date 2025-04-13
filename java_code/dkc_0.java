/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dkc
 */
class dkc_0
extends akk_2 {
    dkc_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "manageFrame";
    }

    @Override
    public String b() {
        return "Active ou d\u00e9sactive des frames, donc des types d'interactions entre l'utilisateur et le jeu.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.A;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        String string = this.i(0);
        ahr_1 ahr_12 = "FightItemUse".equalsIgnoreCase(string) ? cYS.o() : ("ControlCenter".equalsIgnoreCase(string) ? cxu_0.a() : ("Chat".equalsIgnoreCase(string) ? cww_0.c() : ("Shortcut".equalsIgnoreCase(string) ? dcj_0.a() : ("World".equalsIgnoreCase(string) ? dei.a() : ("Overhead".equalsIgnoreCase(string) ? dbm_0.a() : ("FightMovementFrame".equalsIgnoreCase(string) ? cYT.a() : ("Flea".equalsIgnoreCase(string) ? cWw.e() : ("Equipment".equalsIgnoreCase(string) ? cyt_0.a() : ("CharacterSheet".equalsIgnoreCase(string) ? cwu_0.h() : ("TemporaryInventory".equalsIgnoreCase(string) ? dds_0.a() : ("FightEndFrame".equalsIgnoreCase(string) ? cYL.a() : ("SystemBar".equalsIgnoreCase(string) ? ddp.a() : ("MRU".equalsIgnoreCase(string) ? dan.a() : ("Menu".equalsIgnoreCase(string) ? daB.a() : ("UITimelineFrame".equalsIgnoreCase(string) ? ddy_0.a() : ("Protector".equalsIgnoreCase(string) ? dcd_0.a() : null))))))))))))))));
        boolean bl = this.l(1);
        dir_0.a.info((Object)(bl ? "On remet la frame " + string : "On enl\u00e8ve la frame " + string));
        if (ahr_12 != null) {
            if (bl) {
                if (!azu_0.j().c(ahr_12)) {
                    azu_0.j().a(ahr_12);
                } else {
                    this.a(dir_0.a, " On essaie de pousser une frame qui est d\u00e9j\u00e0 l\u00e0. C'est soit un bug, soit une erreur dans un sc\u00e9nario.");
                }
            } else {
                azu_0.j().b(ahr_12);
            }
        } else {
            this.a(dir_0.a, "Cette frame n'est pas support\u00e9e par manageFrame " + string);
        }
    }
}

