/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bsT
 */
public enum bst_1 {
    a,
    b,
    c,
    d,
    e;


    public boolean a() {
        switch (this) {
            case a: 
            case b: {
                return false;
            }
            case c: 
            case d: 
            case e: {
                return true;
            }
        }
        throw new IllegalArgumentException("R\u00e9sultat " + this + " non g\u00e9r\u00e9");
    }

    public String b() {
        switch (this) {
            case c: 
            case d: {
                return "dimensionalBag.error.ie.badPosition";
            }
            case e: {
                return "dimensionalBag.error.ie.maxContentReached";
            }
        }
        throw new IllegalArgumentException("R\u00e9sultat " + this + " non g\u00e9r\u00e9");
    }
}

