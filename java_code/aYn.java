/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aYn
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
    private final float k;
    private final int l;
    private List<Integer> m;
    private String n;
    private String o;

    public aYn() {
        this(3);
    }

    public aYn(int n) {
        this(n, -1.0f);
    }

    public aYn(int n, float f2) {
        this.k = f2;
        this.l = n;
    }

    public aYn(int n, float f2, List<Integer> list) {
        this(n, f2);
        this.m = list;
    }

    public aYn(int n, float f2, List<Integer> list, String string, String string2) {
        this(n, f2, list);
        this.n = string;
        this.o = string2;
    }

    @Override
    public boolean a() {
        switch (this.l) {
            case 0: 
            case 1: 
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return this.k == -1.0f || this.k == 0.0f || this.n != null && this.o != null;
            }
            case 3: 
            case 4: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void b() {
        Object object;
        short s2;
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        if (this.k < 0.0f && this.k != -1.0f) {
            aVo.a().d("Il faut que le facteur d'xp soit >= 0, re\u00e7u=" + this.k);
            return;
        }
        switch (this.l) {
            case 1: {
                s2 = 429;
                break;
            }
            case 0: {
                s2 = 402;
                break;
            }
            case 2: {
                s2 = 99;
                break;
            }
            case 3: {
                s2 = 169;
                break;
            }
            case 5: {
                s2 = 314;
                break;
            }
            case 6: {
                s2 = 279;
                break;
            }
            case 7: {
                s2 = 249;
                break;
            }
            case 8: {
                s2 = 454;
                break;
            }
            case 9: {
                s2 = 88;
                break;
            }
            case 4: {
                String string = "setBonusFactor|sbf help : show full documentation\nsetBonusFactor|sbf : show current bonuses and provided events\nsetBonusFactor|sbf fxp : show current xp bonus\nsetBonusFactor|sbf fxp instanceId : same for an instance\nsetBonusFactor|sbf fxp -1.0 : reset bonus xp for all the server\nsetBonusFactor|sbf fxp -1.0 instanceId : same for instance\nsetBonusFactor|sbf fxp value startDate endDate : apply value as xp bonus from startDate to endDate\nsetBonusFactor|sbf fxp value startDate endDate instanceId : same for instance\nDate syntax : dd/mm/yyyy hh:mm\nreplace fxp by cxp : craft xp\nreplace fxp by k : money loot\nreplace fxp by loot : number of loots try\nreplace fxp by gblf : bonus learning factor for guilds\nreplace fxp by pp : prospection rate\nreplace fxp by pvp : pvp merit and glory orbs limit\nreplace fxp by rights : id of subscription right\n";
                aVo.a().a("setBonusFactor|sbf help : show full documentation\nsetBonusFactor|sbf : show current bonuses and provided events\nsetBonusFactor|sbf fxp : show current xp bonus\nsetBonusFactor|sbf fxp instanceId : same for an instance\nsetBonusFactor|sbf fxp -1.0 : reset bonus xp for all the server\nsetBonusFactor|sbf fxp -1.0 instanceId : same for instance\nsetBonusFactor|sbf fxp value startDate endDate : apply value as xp bonus from startDate to endDate\nsetBonusFactor|sbf fxp value startDate endDate instanceId : same for instance\nDate syntax : dd/mm/yyyy hh:mm\nreplace fxp by cxp : craft xp\nreplace fxp by k : money loot\nreplace fxp by loot : number of loots try\nreplace fxp by gblf : bonus learning factor for guilds\nreplace fxp by pp : prospection rate\nreplace fxp by pvp : pvp merit and glory orbs limit\nreplace fxp by rights : id of subscription right\n");
                return;
            }
            default: {
                return;
            }
        }
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a(s2);
        pt.a(this.k);
        if (this.n != null) {
            object = aXk.a(this.n);
            pt.a(((wt_0)object).h());
            if (object == null) {
                aVo.a().d("Erreur de syntaxe dans la date de d\u00e9part - taper setBonusFactor help pour voir la syntaxe");
                return;
            }
        }
        if (this.o != null) {
            object = aXk.a(this.o);
            pt.a(((wt_0)object).h());
            if (object == null) {
                aVo.a().d("Erreur de syntaxe dans la date de fin - taper setBonusFactor help pour voir la syntaxe");
                return;
            }
        }
        if (this.m != null) {
            for (Integer n : this.m) {
                pt.a(n);
            }
        }
        aaw_22.c(pt);
    }

    public static String c() {
        return null;
    }
}

