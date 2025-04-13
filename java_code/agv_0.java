/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from agV
 */
public abstract class agv_0
implements agw_0,
aqu_2,
aqv_2 {
    protected static final Logger a = Logger.getLogger(agv_0.class);
    private String b;
    private ByteBuffer c;

    @Override
    public void a(String string) {
        InputStream inputStream = null;
        try {
            URL uRL = gg_0.d(string);
            inputStream = uRL.openStream();
        }
        catch (Exception exception) {
            File file = new File(string);
            inputStream = new FileInputStream(file);
        }
        this.a(new BufferedInputStream(inputStream));
    }

    public boolean a(InputStream inputStream) {
        int n = inputStream.available();
        if (n == 0) {
            inputStream.close();
            return true;
        }
        byte[] byArray = new byte[n];
        this.c = ByteBuffer.allocate(n);
        this.c.order(ByteOrder.BIG_ENDIAN);
        int n2 = inputStream.read(byArray);
        while (n2 != -1) {
            this.c.put(byArray, 0, n2);
            n2 = inputStream.read(byArray);
        }
        this.c.rewind();
        this.a(this, new aqy_2[0]);
        this.c.clear();
        inputStream.close();
        this.l();
        return true;
    }

    public boolean a() {
        return this.c.get() != 0;
    }

    public int b() {
        return this.c.getInt();
    }

    public long c() {
        return this.c.getLong();
    }

    public float d() {
        return this.c.getFloat();
    }

    public short e() {
        return this.c.getShort();
    }

    public byte f() {
        return this.c.get();
    }

    public String g() {
        int n = this.b();
        byte[] byArray = new byte[n];
        this.c.get(byArray);
        return Cz.a(byArray);
    }

    public int[] h() {
        int[] nArray;
        int n = this.b();
        try {
            nArray = new int[n];
        }
        catch (OutOfMemoryError outOfMemoryError) {
            a.fatal((Object)("Taille du tableau allou\u00e9 : " + n), (Throwable)outOfMemoryError);
            throw outOfMemoryError;
        }
        for (int k = 0; k < n; ++k) {
            nArray[k] = this.b();
        }
        return nArray;
    }

    public long[] i() {
        long[] lArray;
        int n = this.b();
        try {
            lArray = new long[n];
        }
        catch (OutOfMemoryError outOfMemoryError) {
            a.fatal((Object)("Taille du tableau allou\u00e9 : " + n));
            throw outOfMemoryError;
        }
        for (int k = 0; k < n; ++k) {
            lArray[k] = this.c();
        }
        return lArray;
    }

    public float[] j() {
        int n = this.b();
        float[] fArray = new float[n];
        for (int k = 0; k < n; ++k) {
            fArray[k] = this.d();
        }
        return fArray;
    }

    public byte[] k() {
        int n = this.b();
        byte[] byArray = new byte[n];
        for (int k = 0; k < n; ++k) {
            byArray[k] = this.f();
        }
        return byArray;
    }

    @Override
    public void l() {
    }

    public String m() {
        return this.b;
    }

    public void b(String string) {
        this.b = string;
    }

    public aqv_2 n() {
        return null;
    }

    @Override
    public aqx_2 c(String string) {
        return null;
    }

    @Override
    public ArrayList<aqx_2> d(String string) {
        return null;
    }

    @Override
    public void o() {
    }

    @Override
    public void a(aqw_2 aqw_22) {
    }

    @Override
    public void e(String string) {
    }

    @Override
    public void p() {
    }

    @Override
    public void q() {
    }

    @Override
    public void f(String string) {
    }

    @Override
    public boolean g(String string) {
        return false;
    }

    public void a(aqv_2 aqv_22) {
    }
}

