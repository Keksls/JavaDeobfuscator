/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

/*
 * Renamed from aWs
 */
public final class aws_0
extends aXj {
    private static final Logger d = Logger.getLogger(aws_0.class);
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private final int e;
    private final String[] f;

    public aws_0(int n, String ... stringArray) {
        this.e = n;
        this.f = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.e) {
            case 0: 
            case 1: {
                return this.f.length == 0;
            }
            case 2: {
                return this.f.length == 1;
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
        try {
            switch (this.e) {
                case 0: {
                    this.e();
                    return;
                }
                case 1: {
                    this.d();
                    return;
                }
                case 2: {
                    this.c();
                    return;
                }
            }
        }
        catch (Exception exception) {
            d.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void c() {
        int n = Integer.parseInt(this.f[0]);
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)161);
        pt.a(n);
        aaw_22.c(pt);
    }

    private void d() {
        ArrayList arrayList = new ArrayList();
        eop_1.a.a(new awt_0(this, arrayList));
        Collections.sort(arrayList);
        aws_0.a(arrayList.size() + " challenges disponibles : ");
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            awu_0 awu_02 = (awu_0)arrayList.get(k);
            aws_0.a(awu_02.toString());
        }
    }

    private void e() {
        aws_0.a("(fightchallenge | fc) (help | h) : show documentation");
        aws_0.a("(fightchallenge | fc) (list | l) : show list of available challenges");
        aws_0.a("(fightchallenge | fc) (start | s) id : launch challenge with specified id");
    }
}

