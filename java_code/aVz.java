/*
 * Decompiled with CFR 0.152.
 */
public class aVz
extends aXj {
    private final long a;

    public aVz(long l) {
        this.a = l;
    }

    public aVz(String string) {
        this.a = aVz.d(string);
    }

    private static long d(String string) {
        int n;
        if (string == null) {
            return 0L;
        }
        String string2 = string.trim();
        boolean bl = string2.startsWith("-");
        long l = 0L;
        Object object = "";
        int n2 = n = bl ? 1 : 0;
        while (n < string2.length()) {
            char c2 = string2.charAt(n);
            if ('0' <= c2 && c2 <= '9') {
                object = (String)object + c2;
            } else {
                long l2;
                switch (c2) {
                    case 'k': {
                        l2 = 1000L;
                        break;
                    }
                    case 'm': {
                        l2 = 1000000L;
                        break;
                    }
                    case 'b': {
                        l2 = 1000000000L;
                        break;
                    }
                    case 't': {
                        l2 = 1000000000000L;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Invalid number: " + string2);
                    }
                }
                l += l2 * Long.parseLong((String)object);
                object = "";
            }
            ++n;
        }
        if (!((String)object).isEmpty()) {
            l += Long.parseLong((String)object);
        }
        return l * (long)(bl ? -1 : 1);
    }

    @Override
    public boolean a() {
        return this.a != 0L;
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
        pt.a((short)443);
        pt.a(this.a);
        aaw_22.c(pt);
    }
}

