/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dfa
 */
public class dfa_0
extends dfc {
    private static final Logger a = Logger.getLogger(dfa_0.class);
    private int b;
    private bHN c;

    public int k() {
        return this.b;
    }

    public void c(int n) {
        this.b = n;
    }

    public bHN o() {
        return this.c;
    }

    public void a(bHN bHN2) {
        this.c = bHN2;
    }
}

