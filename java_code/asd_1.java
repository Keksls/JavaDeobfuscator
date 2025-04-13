/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from asd
 */
public final class asd_1
implements abo_1,
asc_1 {
    private static final Logger e = Logger.getLogger(asd_1.class);
    public int a;
    public long b;
    public long c;
    public String d;
    private static final ObjectPool f = new abm_1(new ase_1());

    asd_1() {
    }

    public asd_1(String string, int n, long l, long l2) {
        this.d = string;
        this.a = n;
        this.b = l;
        this.c = l2;
    }

    @Override
    public void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeUTF(this.d);
        dataOutputStream.writeInt(this.a);
        dataOutputStream.writeLong(this.b);
        dataOutputStream.writeLong(this.c);
    }

    @Override
    public void a(DataInputStream dataInputStream) {
        this.d = dataInputStream.readUTF();
        this.a = dataInputStream.readInt();
        this.b = dataInputStream.readLong();
        this.c = dataInputStream.readLong();
    }

    public static asd_1 a(String string, int n, long l, long l2) {
        asd_1 asd_12;
        try {
            asd_12 = (asd_1)f.borrowObject();
        }
        catch (Exception exception) {
            asd_12 = new asd_1();
            e.error((Object)"Erreur lors d'un checkout d'un IndexEntry", (Throwable)exception);
        }
        asd_12.d = string;
        asd_12.a = n;
        asd_12.b = l;
        asd_12.c = l2;
        return asd_12;
    }

    public static asd_1 a() {
        asd_1 asd_12;
        try {
            asd_12 = (asd_1)f.borrowObject();
        }
        catch (Exception exception) {
            asd_12 = new asd_1();
            e.error((Object)"Erreur lors d'un checkout d'un IndexEntry", (Throwable)exception);
        }
        return asd_12;
    }

    public void b() {
        try {
            f.returnObject((Object)this);
        }
        catch (Exception exception) {
            e.error((Object)"Erreur lors d'un release d'un IndexEntry", (Throwable)exception);
        }
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        this.d = null;
    }
}

