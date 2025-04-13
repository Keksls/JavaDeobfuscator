/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aIU
 */
public class aiu_2
implements Comparable {
    private final ajc_2 c;
    private final byte[] d;
    private final ais_2 e;
    private DataInputStream f;
    private DataOutputStream g;
    aje_2 a;
    private boolean h = true;
    protected static final Logger b = Logger.getLogger("com.ankamagames.framework.net.torrent.peer");

    public aiu_2(ajc_2 ajc_22, byte[] byArray, ais_2 ais_22) {
        this.c = ajc_22;
        this.d = byArray;
        this.e = ais_22;
    }

    public aiu_2(Socket socket, BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream, byte[] byArray, ais_2 ais_22) {
        this.d = byArray;
        this.e = ais_22;
        byte[] byArray2 = this.a(bufferedInputStream, bufferedOutputStream);
        this.c = new ajc_2(byArray2, socket.getInetAddress(), socket.getPort());
    }

    public ajc_2 a() {
        return this.c;
    }

    public String toString() {
        return this.c.toString();
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof aiu_2) {
            aiu_2 aiu_22 = (aiu_2)object;
            return this.c.equals(aiu_22.c);
        }
        return false;
    }

    public int compareTo(@NotNull Object object) {
        aiu_2 aiu_22 = (aiu_2)object;
        return this.c.compareTo(aiu_22.c);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ajd_2 ajd_22, ain_2 ain_22) {
        if (this.a != null) {
            throw new IllegalStateException("Peer already started");
        }
        try {
            Object object;
            Object object2;
            Object object3;
            if (this.f == null) {
                object3 = new Socket(this.c.b(), this.c.c());
                object2 = new BufferedInputStream(((Socket)object3).getInputStream());
                object = new BufferedOutputStream(((Socket)object3).getOutputStream());
                byte[] byArray = this.a((BufferedInputStream)object2, (BufferedOutputStream)object);
                byte[] byArray2 = this.c.a();
                if (!Arrays.equals(byArray2, byArray)) {
                    throw new IOException("Unexpected peerID '" + ajc_2.a(byArray) + "' expected '" + ajc_2.a(byArray2) + "'");
                }
            }
            object3 = new aiy_2(this, this.f);
            object2 = new aiz_2(this, this.g);
            object = new aje_2(this, ajd_22, this.e, (aiy_2)object3, (aiz_2)object2);
            if (ain_22 != null) {
                ((aje_2)object).l.a(ain_22);
            }
            this.a = object;
            ajd_22.a(this);
            ((aje_2)object).k.run();
        }
        catch (IOException iOException) {
            b.log(Level.FINE, "Peer connection to " + this.c.b() + " failed ", iOException);
        }
        catch (Throwable throwable) {
            b.log(Level.SEVERE, "Peer connection failed " + this.toString(), throwable);
        }
        finally {
            if (this.h) {
                ajd_22.c(this);
            }
        }
    }

    private byte[] a(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        this.f = new DataInputStream(bufferedInputStream);
        this.g = new DataOutputStream(bufferedOutputStream);
        this.g.write(19);
        this.g.write("BitTorrent protocol".getBytes("UTF-8"));
        byte[] byArray = new byte[8];
        this.g.write(byArray);
        byte[] byArray2 = this.e.b();
        this.g.write(byArray2);
        this.g.write(this.d);
        this.g.flush();
        byte by = this.f.readByte();
        if (by != 19) {
            throw new IOException("Handshake failure, expected 19, got " + (by & 0xFF));
        }
        byte[] byArray3 = new byte[19];
        this.f.readFully(byArray3);
        String string = new String(byArray3, "UTF-8");
        if (!"BitTorrent protocol".equals(string)) {
            throw new IOException("Handshake failure, expected 'Bittorrent protocol', got '" + string + "'");
        }
        this.f.readFully(byArray);
        byArray3 = new byte[20];
        this.f.readFully(byArray3);
        if (!Arrays.equals(byArray2, byArray3)) {
            throw new IOException("Unexpected MetaInfo hash");
        }
        this.f.readFully(byArray3);
        return byArray3;
    }

    public boolean b() {
        return this.a != null;
    }

    public void a(boolean bl) {
        this.h = bl;
        this.c();
    }

    void c() {
        aje_2 aje_22 = this.a;
        if (aje_22 != null) {
            aiz_2 aiz_22;
            this.a = null;
            aiy_2 aiy_22 = aje_22.k;
            if (aiy_22 != null) {
                aiy_22.a();
            }
            if ((aiz_22 = aje_22.l) != null) {
                aiz_22.a();
            }
        }
    }

    public void a(int n) {
        aje_2 aje_22 = this.a;
        if (aje_22 != null) {
            aje_22.c(n);
        }
    }

    public boolean d() {
        aje_2 aje_22 = this.a;
        return aje_22 != null && aje_22.f;
    }

    public void b(boolean bl) {
        aje_2 aje_22 = this.a;
        if (aje_22 != null) {
            aje_22.c(bl);
        }
    }

    public boolean e() {
        aje_2 aje_22 = this.a;
        return aje_22 != null && aje_22.d;
    }

    public void c(boolean bl) {
        aje_2 aje_22 = this.a;
        if (aje_22 != null) {
            aje_22.d(bl);
        }
    }

    public boolean f() {
        aje_2 aje_22 = this.a;
        return aje_22 == null || aje_22.e;
    }

    public boolean g() {
        aje_2 aje_22 = this.a;
        return aje_22 == null || aje_22.g;
    }

    public long h() {
        aje_2 aje_22 = this.a;
        return aje_22 != null ? aje_22.h : 0L;
    }

    public long i() {
        aje_2 aje_22 = this.a;
        return aje_22 != null ? aje_22.i : 0L;
    }

    public void j() {
        aje_2 aje_22 = this.a;
        if (aje_22 != null) {
            aje_22.h = 0L;
            aje_22.i = 0L;
        }
    }
}

