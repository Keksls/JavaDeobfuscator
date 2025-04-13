/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fkP
extends fkN {
    private static final Logger b = Logger.getLogger(fkP.class);
    private final int c;
    private final int d;

    public fkP(fkt_0 fkt_02, int n, int n2) {
        super(fkt_02);
        this.d = n;
        this.c = n2;
    }

    public int b() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    @Override
    public final fkO a() {
        return fkO.f;
    }
}

