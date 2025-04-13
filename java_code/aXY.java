/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aXY
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    private final int c;
    private List<Short> d;
    private int e;
    private String f;
    private String g;
    private String h;

    public aXY(int n) {
        this.c = n;
    }

    public aXY(int n, String string) {
        this.h = string;
        this.c = n;
    }

    public aXY(int n, String string, int n2) {
        this(n, string);
        this.d = new ArrayList<Short>();
        this.d.add((short)n2);
    }

    public aXY(int n, String string, List<Integer> list) {
        this(n, string);
        this.d = list.stream().map(Hw::c).collect(Collectors.toList());
    }

    public aXY(int n, String string, int n2, List<Integer> list, String string2, String string3) {
        this(n, string, list);
        this.e = n2;
        this.f = string2;
        this.g = string3;
    }

    public aXY() {
        this.c = 1;
    }

    @Override
    public boolean a() {
        return true;
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
        switch (this.c) {
            case 0: {
                s2 = 248;
                break;
            }
            case 1: {
                String string = "spam help : show full documentation\nspam message instanceId : same for an instance. Instance id -1 equals to all the instances\nspam message delay startDate endDate -1 : send message from start date to end date to all the players with delay between two messages\nspam message delay startDate endDate instanceId(s) : same for instance\nDate syntax : dd/mm/yyyy hh:mm\nDelay is in minutes";
                aVo.a().a("spam help : show full documentation\nspam message instanceId : same for an instance. Instance id -1 equals to all the instances\nspam message delay startDate endDate -1 : send message from start date to end date to all the players with delay between two messages\nspam message delay startDate endDate instanceId(s) : same for instance\nDate syntax : dd/mm/yyyy hh:mm\nDelay is in minutes");
                return;
            }
            default: {
                return;
            }
        }
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a(s2);
        pt.a(this.h);
        pt.a(this.e);
        if (this.f != null) {
            object = aXk.a(this.f);
            pt.a(((wt_0)object).h());
            if (object == null) {
                aVo.a().d("Erreur de syntaxe dans la date de d\u00e9part - taper spam help pour voir la syntaxe");
                return;
            }
        } else {
            pt.a(0L);
        }
        if (this.g != null) {
            object = aXk.a(this.g);
            pt.a(((wt_0)object).h());
            if (object == null) {
                aVo.a().d("Erreur de syntaxe dans la date de fin - taper spam help pour voir la syntaxe");
                return;
            }
        } else {
            pt.a(0L);
        }
        if (this.d != null) {
            for (Short s3 : this.d) {
                pt.b(s3);
            }
        }
        aaw_22.c(pt);
    }
}

