/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cez
 */
public abstract class cez_0
extends aaw_2 {
    private static final Logger c = Logger.getLogger(cez_0.class);
    private byte[] d;
    private aaw_2 e;
    private byte f;

    public cez_0() {
        this.a(new ceV(this));
    }

    public aaw_2 K() {
        return this.e;
    }

    public void a(aaw_2 aaw_22) {
        this.e = aaw_22;
    }

    public byte[] L() {
        return this.d;
    }

    public void b(byte[] byArray) {
        this.d = byArray;
    }

    public byte M() {
        return this.f;
    }

    public void a(byte by) {
        c.info((Object)("Raison de la d\u00e9connection de l'entit\u00e9 " + this.a_() + " : " + by));
        this.f = by;
    }

    public void p() {
        this.a();
        this.a(new ceV(this));
    }

    public void q() {
        c.info((Object)"cleanUp() de la ProxyClientEntity, on fait un setTicket \u00e0 null");
        this.a((byte)53);
        this.p();
    }

    public abstract void s();

    public abstract void b(int var1);

    public abstract void a(byte[] var1);
}

