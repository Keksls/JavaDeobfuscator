/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayC
 */
public enum ayc_2 {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i;


    public int a(int n) {
        switch (this) {
            case a: 
            case d: 
            case g: {
                return 0;
            }
            case b: 
            case e: 
            case h: {
                return (int)(-Math.max(0.0, (double)n * 0.5));
            }
            case c: 
            case f: 
            case i: {
                return -Math.max(0, n);
            }
        }
        return 0;
    }

    public int b(int n) {
        switch (this) {
            case a: 
            case b: 
            case c: {
                return -Math.max(0, n);
            }
            case d: 
            case e: 
            case f: {
                return (int)(-Math.max(0.0, (double)n * 0.5));
            }
            case g: 
            case h: 
            case i: {
                return 0;
            }
        }
        return 0;
    }

    public int a(int n, int n2) {
        switch (this) {
            case a: 
            case d: 
            case g: {
                return 0;
            }
            case b: 
            case e: 
            case h: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case c: 
            case f: 
            case i: {
                return Math.max(0, n2 - n);
            }
        }
        return 0;
    }

    public int b(int n, int n2) {
        switch (this) {
            case a: 
            case b: 
            case c: {
                return n2 - n;
            }
            case d: 
            case e: 
            case f: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case g: 
            case h: 
            case i: {
                return 0;
            }
        }
        return 0;
    }
}

