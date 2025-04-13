/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aYI
 */
public class ayi_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private static final int f = -1;
    private final int g;
    private final Object[] h;

    public ayi_0(int n, Object ... objectArray) {
        this.g = n;
        this.h = objectArray;
    }

    @Override
    public boolean a() {
        switch (this.g) {
            case 0: {
                return this.h.length == 2;
            }
            case 1: 
            case 3: {
                return this.h.length == 1 && this.h[0] != null;
            }
            case 4: {
                return this.h.length == 1;
            }
            case 2: {
                return this.h.length == 3;
            }
        }
        return false;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        switch (this.g) {
            case 0: {
                pt.a((short)243);
                pt.a((Integer)this.h[0]);
                pt.a((Integer)this.h[1]);
                break;
            }
            case 1: {
                pt.a((short)68);
                pt.a((Long)this.h[0]);
                break;
            }
            case 2: {
                pt.a((short)144);
                pt.a((Integer)this.h[0]);
                pt.a((Integer)this.h[1]);
                pt.a((Long)this.h[2]);
                break;
            }
            case 3: {
                long l = ayi_0.d((String)this.h[0]);
                if (l == -1L) break;
                pt.a((short)68);
                pt.a(l);
                break;
            }
            case 4: {
                pt.a((byte)2);
                pt.a((short)23);
                pt.b((short)364);
                pt.a((String)this.h[0]);
            }
        }
        if (pt.c() == 0) {
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static long d(String string) {
        String string2 = Cz.e(string);
        StringBuilder stringBuilder = new StringBuilder("\nInstance(s) matching \"").append(string).append("\" :\r\n========\r\n");
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (cct_1 cct_12 : (cct_1[])ccs_1.a().d().values((Object[])new cct_1[ccs_1.a().d().size()])) {
            long l = cct_12.a;
            String string3 = bae.h().a(77, l, new Object[0]);
            if (Cz.e(string3).equals(string2)) {
                return l;
            }
            if (!Cz.e(string3).contains(string2)) continue;
            arrayList.add(l);
            stringBuilder.append(l).append(" : ").append(string3).append("\r\n");
        }
        if (arrayList.isEmpty()) {
            ayi_0.c("No instance found with name matching \"" + string + "\"!");
            return -1L;
        }
        if (arrayList.size() == 1) {
            return (Long)arrayList.get(0);
        }
        stringBuilder.append("========\r\n").append(arrayList.size()).append(" items found");
        aVo.a().a(stringBuilder.toString(), 0xFFFFFF);
        return -1L;
    }
}

