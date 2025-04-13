/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Optional;

public class aWn
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 9;
    private final int i;
    private final String[] j;

    public aWn(int n, String ... stringArray) {
        this.i = n;
        this.j = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.i) {
            case 0: 
            case 1: 
            case 9: {
                return this.j.length == 0;
            }
            case 6: {
                return this.j.length == 0 || this.j.length == 1;
            }
            case 2: 
            case 7: 
            case 8: {
                return this.j.length == 1;
            }
            case 5: {
                return this.j.length == 1 || this.j.length == 2;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        switch (this.i) {
            case 0: {
                aWn.d();
                break;
            }
            case 1: {
                aWn.a(aaw_22);
                break;
            }
            case 2: {
                this.b(aaw_22);
                break;
            }
            case 5: {
                this.c(aaw_22);
                break;
            }
            case 6: {
                this.c();
                break;
            }
            case 7: {
                this.a(aaw_22, true);
                break;
            }
            case 8: {
                this.a(aaw_22, false);
                break;
            }
            case 9: {
                aWn.d(aaw_22);
                break;
            }
        }
    }

    private static void a(aaw_2 aaw_22) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)360);
        pt.a(bmr_12.a_());
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        int n = Integer.parseInt(this.j[0]);
        if (n < 1 || n > 50) {
            aVo.a().d("Le niveau d'objet doit \u00eatre entre 1 et 50!");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)26);
        pt.a(bmr_12.a_());
        pt.a(n);
        aaw_22.c(pt);
    }

    private void c(aaw_2 aaw_22) {
        Object object;
        int n;
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        int n2 = Integer.parseInt(this.j[0]);
        if (n2 < 1 || n2 > 10) {
            aVo.a().d("Difficult\u00e9 hors des limites disponibles.");
            return;
        }
        if (this.j.length == 2) {
            n = Integer.parseInt(this.j[1]);
            object = ezd_2.a.a(n);
            if (object == null) {
                aVo.a().d("Cet id ne correspond pas \u00e0 un donjon.");
                return;
            }
        } else {
            if (!bmr_12.dP().isPresent()) {
                aVo.a().d("Pas dans un donjon.");
                return;
            }
            object = bmr_12.dP().get();
            long l = object.a();
            Optional<ezb_2> optional = ezd_2.a.a(l);
            if (optional.isEmpty()) {
                aVo.a().d("Pas dans un donjon.");
                return;
            }
            n = optional.get().a();
        }
        object = new Pt();
        ((Pt)object).a((byte)3);
        ((Pt)object).a((short)208);
        ((Pt)object).a(bmr_12.a_());
        ((Pt)object).a(n);
        ((Pt)object).a(n2);
        aaw_22.c(object);
    }

    private void a(aaw_2 aaw_22, boolean bl) {
        int n = Integer.parseInt(this.j[0]);
        boolean bl2 = ban_2.a.b(n).isPresent();
        ezb_2 ezb_22 = ezd_2.a.a(n);
        if (!bl2 && ezb_22 == null) {
            aVo.a().d("Cet id ne correspond pas \u00e0 un donjon.");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)278);
        pt.a(n);
        pt.a(bl);
        aaw_22.c(pt);
    }

    private void c() {
        aWn.a("Dungeon List:");
        String string = this.j.length > 0 ? this.j[0].toLowerCase() : "";
        ezd_2.a.a((TObjectProcedure<ezb_2>)((TObjectProcedure)ezb_22 -> {
            String string2 = bae.h().a(137, (long)ezb_22.a(), new Object[0]);
            if (string.isEmpty() || string2.toLowerCase().contains(string)) {
                aWn.a(String.format("%3d %s", ezb_22.a(), string2));
            }
            return true;
        }));
        ban_2.a.a().forEach((n, bao_22) -> {
            String string2 = bae.h().a(137, (long)n.intValue(), new Object[0]);
            if (string.isEmpty() || string2.toLowerCase().contains(string)) {
                aWn.a(String.format("%3d %s", n, string2));
            }
        });
    }

    private static void d(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)425);
        aaw_22.c(pt);
    }

    private static void d() {
        aWn.a("Syntax: dungeon | dj <command>");
        aWn.a("(help | h) : show help");
        aWn.a("(info | i) : show information about dungeon difficulty");
        aWn.a("(level | lv) <1-50> : change the difficulty of the dungeon");
        aWn.a("(progression | p) <1-50> : set the current character max reached difficulty of the current dungeon");
        aWn.a("(progression | p) <1-50> dungeonId : set the current character max reached difficulty of the given dungeon");
        aWn.a("(list) : show the list of dungeon ids");
        aWn.a("(list) \"dungeon name\" : show the ids of the dungeons matching the search");
        aWn.a("(lock) dungeonId : lock the dungeon entrance");
        aWn.a("(unlock) dungeonId : unlock the dungeon entrance");
        aWn.a("(status) : show the locked dungeons");
    }
}

