/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aVY
 */
public final class avy_0
extends aXj {
    private static final Logger c = Logger.getLogger(avy_0.class);
    public static final int a = 1;
    public static final int b = 2;
    private final int d;
    private final String[] e;

    public avy_0(int n, String ... stringArray) {
        this.d = n;
        this.e = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.d) {
            case 1: 
            case 2: {
                return this.e.length == 1;
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
        try {
            switch (this.d) {
                case 1: {
                    this.d();
                    break;
                }
                case 2: {
                    this.c();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande de calendrier " + exception);
        }
    }

    private void c() {
        bue_0 bue_02 = bum_1.a(bum_1.d.a(), 0);
        ArrayList<aot_2> arrayList = new ArrayList<aot_2>();
        arrayList.add(new aox_1(Integer.parseInt(this.e[0])));
        arrayList.add(new aov_2(false));
        bue_02.b(arrayList);
        bue_02.a();
    }

    private void d() {
        bue_0 bue_02 = bum_1.a(bum_1.d.a(), 0);
        ArrayList<aot_2> arrayList = new ArrayList<aot_2>();
        arrayList.add(new aox_1(Integer.parseInt(this.e[0])));
        arrayList.add(new aov_2(true));
        bue_02.b(arrayList);
        bue_02.a();
    }
}

