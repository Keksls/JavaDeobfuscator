/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownServiceException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/*
 * Renamed from aMz
 */
public class amz_1
extends Thread {
    private static final boolean g = true;
    private URLConnection h = null;
    private InputStream i = null;
    byte[] a = null;
    final int b = 2048;
    int c = 0;
    int d = 0;
    byte[] e;
    int f;
    private SourceDataLine j = null;
    private float[][][] k;
    private int[] l;
    private final fkt_2 m = new fkt_2();
    private final fku_2 n = new fku_2();
    private final fkv_2 o = new fkv_2();
    private final fkw_2 p = new fkw_2();
    private final fle_1 q = new fle_1();
    private final fkx_2 r = new fkx_2(this.q);
    private final flb_1 s = new flb_1();
    private final fls_1 t = new fls_1();

    public static void a(String[] stringArray) {
        String string;
        string = stringArray.length > 0 ? (string = stringArray[0]) : null;
        string = "file:////H:\\Work\\Adamai_Assets\\audio\\export\\musics\\200000.ogg";
        if (string != null) {
            amz_1 amz_12 = new amz_1(string);
            amz_12.start();
        } else {
            System.err.println("Please provide an argument with the file to play.");
        }
    }

    amz_1(String string) {
        this.a(this.a(string));
    }

    public URL a(String string) {
        URL uRL = null;
        try {
            uRL = gg_0.d(string);
        }
        catch (MalformedURLException malformedURLException) {
            System.err.println("Malformed \"url\" parameter: \"" + string + "\"");
        }
        return uRL;
    }

    private void a(URL uRL) {
        try {
            this.h = uRL.openConnection();
        }
        catch (UnknownServiceException unknownServiceException) {
            System.err.println("The protocol does not support input.");
        }
        catch (IOException iOException) {
            System.err.println("An I/O error occoured while trying create the URL connection.");
        }
        if (this.h != null) {
            try {
                this.i = this.h.getInputStream();
            }
            catch (IOException iOException) {
                System.err.println("An I/O error occoured while trying to get an input stream from the URL.");
                System.err.println(iOException);
            }
        }
    }

    @Override
    public void run() {
        if (this.i == null) {
            System.err.println("We don't have an input stream and therefor cannot continue.");
            return;
        }
        this.a();
        if (this.b() && this.c()) {
            this.d();
        }
        this.e();
    }

    private void a() {
        this.b("Initializing JOrbis.");
        this.p.a(2048);
        this.a = this.p.a;
        this.b("Done initializing JOrbis.");
    }

    private boolean b() {
        this.b("Starting to read the header.");
        boolean bl = true;
        int n = 1;
        while (bl) {
            try {
                this.c = this.i.read(this.a, this.d, 2048);
            }
            catch (IOException iOException) {
                System.err.println("Could not read from the input stream.");
                System.err.println(iOException);
            }
            this.p.b(this.c);
            block1 : switch (n) {
                case 1: {
                    switch (this.p.b(this.n)) {
                        case -1: {
                            System.err.println("There is a hole in the first packet data.");
                            return false;
                        }
                        case 0: {
                            break;
                        }
                        case 1: {
                            this.o.a(this.n.g());
                            this.o.f();
                            this.t.a();
                            this.s.a();
                            if (this.o.a(this.n) == -1) {
                                System.err.println("We got an error while reading the first header page.");
                                return false;
                            }
                            if (this.o.b(this.m) != 1) {
                                System.err.println("We got an error while reading the first header packet.");
                                return false;
                            }
                            if (this.t.a(this.s, this.m) < 0) {
                                System.err.println("We got an error while interpreting the first packet. Apparantly, it's not Vorbis data.");
                                return false;
                            }
                            ++n;
                        }
                    }
                    if (n == 1) break;
                }
                case 2: 
                case 3: {
                    switch (this.p.b(this.n)) {
                        case -1: {
                            System.err.println("There is a hole in the second or third packet data.");
                            return false;
                        }
                        case 0: {
                            break block1;
                        }
                        case 1: {
                            this.o.a(this.n);
                            switch (this.o.b(this.m)) {
                                case -1: {
                                    System.err.println("There is a hole in the firstpacket data.");
                                    return false;
                                }
                                case 0: {
                                    break block1;
                                }
                                case 1: {
                                    this.t.a(this.s, this.m);
                                    if (++n != 4) break block1;
                                    bl = false;
                                }
                            }
                        }
                    }
                }
            }
            this.d = this.p.a(2048);
            this.a = this.p.a;
            if (this.c != 0 || !bl) continue;
            System.err.println("Not enough header data was supplied.");
            return false;
        }
        this.b("Finished reading the header.");
        return true;
    }

    private boolean c() {
        this.b("Initializing the sound system.");
        this.f = 4096;
        this.e = new byte[this.f];
        this.q.a(this.t);
        this.r.a(this.q);
        int n = this.t.b;
        int n2 = this.t.c;
        AudioFormat audioFormat = new AudioFormat(n2, 16, n, true, false);
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat, -1);
        if (!AudioSystem.isLineSupported(info)) {
            System.err.println("Audio output line is not supported.");
            return false;
        }
        try {
            this.j = (SourceDataLine)AudioSystem.getLine(info);
            this.j.open(audioFormat);
        }
        catch (LineUnavailableException lineUnavailableException) {
            System.out.println("The audio output line could not be opened due to resource restrictions.");
            System.err.println(lineUnavailableException);
            return false;
        }
        catch (IllegalStateException illegalStateException) {
            System.out.println("The audio output line is already open.");
            System.err.println(illegalStateException);
            return false;
        }
        catch (SecurityException securityException) {
            System.out.println("The audio output line could not be opened due to security restrictions.");
            System.err.println(securityException);
            return false;
        }
        this.j.start();
        this.k = new float[1][][];
        this.l = new int[this.t.b];
        this.b("Done initializing the sound system.");
        return true;
    }

    private void d() {
        this.b("Reading the body.");
        boolean bl = true;
        while (bl) {
            switch (this.p.b(this.n)) {
                case -1: {
                    this.b("There is a hole in the data. We proceed.");
                }
                case 0: {
                    break;
                }
                case 1: {
                    this.o.a(this.n);
                    if (this.n.f() == 0L) {
                        bl = false;
                        break;
                    }
                    block13: while (true) {
                        switch (this.o.b(this.m)) {
                            case -1: {
                                this.b("There is a hole in the data, we continue though.");
                            }
                            case 0: {
                                break block13;
                            }
                            case 1: {
                                this.f();
                            }
                            default: {
                                continue block13;
                            }
                        }
                        break;
                    }
                    if (this.n.e() == 0) break;
                    bl = false;
                }
            }
            if (!bl) continue;
            this.d = this.p.a(2048);
            this.a = this.p.a;
            try {
                this.c = this.i.read(this.a, this.d, 2048);
            }
            catch (Exception exception) {
                System.err.println(exception);
                return;
            }
            this.p.b(this.c);
            if (this.c != 0) continue;
            bl = false;
        }
        this.b("Done reading the body.");
    }

    private void e() {
        this.b("Cleaning up.");
        this.o.c();
        this.r.a();
        this.q.a();
        this.t.b();
        this.p.a();
        try {
            if (this.i != null) {
                this.i.close();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.b("Done cleaning up.");
    }

    private void f() {
        int n;
        if (this.r.a(this.m) == 0) {
            this.q.a(this.r);
        }
        while ((n = this.q.a(this.k, this.l)) > 0) {
            int n2 = n < this.f ? n : this.f;
            for (int k = 0; k < this.t.b; ++k) {
                int n3 = k * 2;
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n4 = (int)(this.k[0][k][this.l[k] + i2] * 32767.0f);
                    if (n4 > Short.MAX_VALUE) {
                        n4 = Short.MAX_VALUE;
                    }
                    if (n4 < Short.MIN_VALUE) {
                        n4 = Short.MIN_VALUE;
                    }
                    if (n4 < 0) {
                        n4 |= 0x8000;
                    }
                    this.e[n3] = (byte)n4;
                    this.e[n3 + 1] = (byte)(n4 >>> 8);
                    n3 += 2 * this.t.b;
                }
            }
            this.j.write(this.e, 0, 2 * this.t.b * n2);
            this.q.a(n2);
        }
    }

    private void b(String string) {
        System.out.println("Debug: " + string);
    }
}

