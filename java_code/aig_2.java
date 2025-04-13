/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import org.apache.log4j.Logger;

/*
 * Renamed from aIG
 */
public class aig_2
implements Runnable {
    protected static final Logger a = Logger.getLogger(aig_2.class);
    private static boolean c = false;
    private static int d = 1;
    private Socket e = null;
    private Socket f = null;
    private PrintStream g = null;
    private BufferedReader h = null;
    private long i = 0L;
    private boolean j = false;
    public String b = "\n";
    private static final int k = 4096;
    private static long l;
    private int m;
    private String n;
    private File o;
    private RandomAccessFile p;
    private aif_2 q;

    public aig_2() {
    }

    public aig_2(boolean bl, int n, aif_2 aif_22) {
        this.q = aif_22;
        c = bl;
        d = n;
        l = 0L;
    }

    public long a() {
        return l;
    }

    private void f(String string) {
        if (c) {
            a.error((Object)string);
        }
    }

    public boolean a(String string) {
        return this.a(string, 21);
    }

    public boolean a(String string, int n) {
        if (this.e == null) {
            try {
                this.e = new Socket(string, n);
            }
            catch (UnknownHostException unknownHostException) {
                a.error((Object)("Exception dans FtpConnection.connect() : " + unknownHostException.getMessage()));
                return false;
            }
            this.g = new PrintStream(this.e.getOutputStream());
            this.h = new BufferedReader(new InputStreamReader(this.e.getInputStream()));
            if (!this.e(this.e())) {
                this.b();
                return false;
            }
        } else {
            this.g = new PrintStream(this.e.getOutputStream());
            this.h = new BufferedReader(new InputStreamReader(this.e.getInputStream()));
        }
        return true;
    }

    public void b() {
        if (this.g != null) {
            try {
                if (this.j) {
                    this.c();
                }
                this.g.close();
                this.h.close();
                this.e.close();
            }
            catch (IOException iOException) {
                a.error((Object)("Exception dans FtpConnection.disconnect() : " + iOException.getMessage()));
            }
            this.g = null;
            this.h = null;
            this.e = null;
        }
    }

    public boolean a(String string, String string2) {
        int n = this.d("user " + string);
        if (!this.d(n)) {
            return false;
        }
        n = this.d("pass " + string2);
        this.j = this.e(n);
        return this.j;
    }

    public boolean c() {
        int n = this.d("quit");
        this.j = !this.e(n);
        return !this.j;
    }

    public boolean b(String string) {
        int n = this.d("cwd " + string);
        return this.e(n);
    }

    public long c(String string) {
        String string2 = this.h(this.e("size " + string));
        try {
            return Long.parseLong(string2);
        }
        catch (Exception exception) {
            if (exception.getMessage().compareToIgnoreCase("For input string: \"" + string + ": too large for type A SIZE.\"") == 0) {
                return 0L;
            }
            a.error((Object)("Exception FtpConnection.getFileSize() : " + exception.getMessage()));
            return -1L;
        }
    }

    @Override
    public void run() {
        this.n = this.q.p();
        a.info((Object)("retr " + this.n + " " + this.q.j()));
        try {
            this.a("retr " + this.n, this.q.j(), this.q.q(), this.q.r());
            this.p.close();
            this.q.t().a(this.q, this.q.r() == 0);
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during FtpConnection run", (Throwable)iOException);
        }
    }

    public void a(int n) {
        this.i = n;
        this.f("Restart noted");
    }

    private int e() {
        return Integer.parseInt(this.f().substring(0, 3));
    }

    private String f() {
        String string;
        do {
            string = this.h.readLine();
            while (string == null) {
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedException) {
                    a.error((Object)"InterruptedException during getFullServerReply", (Throwable)interruptedException);
                }
                if ((string = this.h.readLine()) != null) continue;
                return "000";
            }
            this.f(string);
        } while (!Character.isDigit(string.charAt(0)) || !Character.isDigit(string.charAt(1)) || !Character.isDigit(string.charAt(2)) || string.charAt(3) != ' ');
        return string;
    }

    public int d(String string) {
        if (c) {
            a.info((Object)string);
        }
        this.g.println(string);
        return this.e();
    }

    public String e(String string) {
        if (c) {
            a.info((Object)string);
        }
        this.g.println(string);
        return this.f();
    }

    private void a(String string, String string2, int n, int n2) {
        Object object;
        this.i = n;
        if (n2 <= 0) {
            object = File.createTempFile(string2, ".tmp", this.o);
            this.q.b((File)object);
            this.p = new RandomAccessFile((File)object, "rw");
        } else {
            this.p = new RandomAccessFile(string2, "rw");
        }
        a.info((Object)("Pointeur = " + this.i));
        if (this.i != 0L) {
            this.f("Seeking to " + this.i);
            this.p.seek(this.i);
        }
        object = new FileOutputStream(this.p.getFD());
        this.a(string, (OutputStream)object, n, n2);
        this.p.close();
    }

    public boolean a(String string, OutputStream outputStream, int n, int n2) {
        if (d == 0) {
            if (!this.g(string)) {
                return false;
            }
            InputStream inputStream = this.f.getInputStream();
            this.a(inputStream, outputStream, n, n2);
            inputStream.close();
            this.f.close();
        } else if (d == 1) {
            ServerSocket serverSocket = new ServerSocket(0);
            if (!this.a(string, serverSocket)) {
                return false;
            }
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            this.a(inputStream, outputStream, n, n2);
            inputStream.close();
            socket.close();
        }
        return this.e(this.e());
    }

    public boolean a(String string, StringBuffer stringBuffer, int n, int n2) {
        if (d == 0) {
            if (!this.g(string)) {
                return false;
            }
            InputStream inputStream = this.f.getInputStream();
            this.a(inputStream, stringBuffer, n, n2);
            inputStream.close();
            this.f.close();
        } else if (d == 1) {
            ServerSocket serverSocket = new ServerSocket(0);
            if (!this.a(string, serverSocket)) {
                return false;
            }
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            this.a(inputStream, stringBuffer, n, n2);
            inputStream.close();
            socket.close();
            serverSocket.close();
        }
        return this.e(this.e());
    }

    private void a(InputStream inputStream, OutputStream outputStream, int n, int n2) {
        long l;
        byte[] byArray = new byte[4096];
        long l2 = System.currentTimeMillis();
        if (n2 > 0 && this.m < 0) {
            int n3;
            for (l = 0L; l < (long)(n2 - n); l += (long)n3) {
                n3 = inputStream.read(byArray, 0, 4096);
                outputStream.write(byArray, 0, n3);
                aif_2.m = aig_2.l += (long)n3;
            }
        } else if (n2 > 0 && this.m > 0) {
            byArray = new byte[this.m];
            long l3 = 0L;
            while (l <= (long)(n2 - n)) {
                int n4 = inputStream.read(byArray, 0, 4096);
                if (n4 > 0) {
                    outputStream.write(byArray, 0, n4);
                    if ((l3 += (long)n4) >= (long)this.m) {
                        long l4 = System.currentTimeMillis();
                        long l5 = l4 - l2;
                        if (l5 < 1000L) {
                            try {
                                Thread.sleep(1000L - l5);
                            }
                            catch (InterruptedException interruptedException) {
                                a.error((Object)"InterruptedException during transferData", (Throwable)interruptedException);
                            }
                        }
                        aif_2.m = aig_2.l += l3;
                        l3 = 0L;
                        l2 = System.currentTimeMillis();
                    }
                }
                l += (long)n4;
            }
        } else if (this.m > 0) {
            int n5;
            long l6 = 0L;
            while ((n5 = inputStream.read(byArray, 0, 4096)) > 0) {
                if (n5 > 0) {
                    outputStream.write(byArray, 0, n5);
                    if ((l6 += (long)n5) >= (long)this.m) {
                        long l7 = System.currentTimeMillis();
                        long l8 = l7 - l2;
                        if (l8 < 1000L) {
                            try {
                                Thread.sleep(1000L - l8);
                            }
                            catch (InterruptedException interruptedException) {
                                a.error((Object)"InterruptedException during transferData", (Throwable)interruptedException);
                            }
                        }
                        aif_2.m = aig_2.l += l6;
                        l6 = 0L;
                        l2 = System.currentTimeMillis();
                    }
                }
                l += (long)n5;
            }
        } else {
            int n6;
            while ((n6 = inputStream.read(byArray, 0, 4096)) > 0) {
                outputStream.write(byArray, 0, n6);
                aif_2.m = aig_2.l += (long)n6;
                l += (long)n6;
            }
        }
    }

    private void a(InputStream inputStream, StringBuffer stringBuffer, int n, int n2) {
        int n3;
        byte[] byArray = new byte[4096];
        for (long k = 0L; k < (long)(n2 - n); k += (long)n3) {
            n3 = inputStream.read(byArray, 0, 4096);
            stringBuffer.append(new String(byArray, 0, n3));
            aif_2.m = l += (long)n3;
        }
    }

    private boolean a(String string, ServerSocket serverSocket) {
        while (!this.a(serverSocket)) {
            serverSocket = new ServerSocket(1);
        }
        if (c) {
            a.info((Object)"TYPE i");
        }
        this.g.println("TYPE i");
        if (!this.e(this.e())) {
            this.f("Could not set transfer type");
            return false;
        }
        if (this.i != 0L) {
            if (c) {
                a.info((Object)("rest " + this.i));
            }
            this.g.println("rest " + this.i);
            this.e();
        }
        if (c) {
            a.info((Object)string);
        }
        this.g.println(string);
        return this.c(this.e());
    }

    private boolean g(String string) {
        if (!this.g()) {
            return false;
        }
        if (c) {
            a.info((Object)"TYPE i");
        }
        this.g.println("TYPE i");
        if (!this.e(this.e())) {
            this.f("Could not set transfer type");
            return false;
        }
        byte[] byArray = new byte[2048];
        String string2 = "";
        if (aif_2.l <= 0L) {
            String[] stringArray;
            this.g.println("LIST");
            this.f("LIST");
            if (!this.e(this.e())) {
                this.f("Could not List");
                return false;
            }
            InputStream inputStream = this.f.getInputStream();
            while (inputStream.read(byArray, 0, 2048) > 0) {
                string2 = string2.concat(new String(byArray));
            }
            for (String string3 : stringArray = string2.split("\n")) {
                if (!string3.contains(this.n)) continue;
                String[] stringArray2 = string3.split(" ");
                String string4 = "";
                String string5 = "";
                int n = 4;
                int n2 = 8;
                for (int k = 0; k < stringArray2.length; ++k) {
                    if (stringArray2[k].compareToIgnoreCase("") == 0) {
                        ++n;
                        ++n2;
                        continue;
                    }
                    if (k == n) {
                        string4 = stringArray2[n];
                        continue;
                    }
                    if (k != n2) continue;
                    string5 = stringArray2[n2];
                }
                if (string5.compareToIgnoreCase(this.n) != 0) continue;
                aif_2.l = Integer.parseInt(string4);
                break;
            }
            if (!this.e(this.e())) {
                this.f("List not finished correctly");
                return false;
            }
            if (!this.g()) {
                return false;
            }
        }
        this.q.t().b(this.q);
        if (this.i != 0L) {
            if (c) {
                a.info((Object)("rest " + this.i));
            }
            this.g.println("rest " + this.i);
            this.e();
        }
        if (c) {
            a.info((Object)string);
        }
        this.g.println(string);
        return this.c(this.e());
    }

    private boolean a(ServerSocket serverSocket) {
        InetAddress inetAddress;
        int n = serverSocket.getLocalPort();
        try {
            inetAddress = InetAddress.getLocalHost();
        }
        catch (UnknownHostException unknownHostException) {
            this.f("Exception dans FtpConnection.openPort() (Can't get local host) : " + unknownHostException.getMessage());
            return false;
        }
        byte[] byArray = inetAddress.getAddress();
        short[] sArray = new short[4];
        for (int k = 0; k <= 3; ++k) {
            sArray[k] = byArray[k];
            if (sArray[k] >= 0) continue;
            int n2 = k;
            sArray[n2] = (short)(sArray[n2] + 256);
        }
        String string = "port " + sArray[0] + "," + sArray[1] + "," + sArray[2] + "," + sArray[3] + "," + ((n & 0xFF00) >> 8) + "," + (n & 0xFF);
        if (c) {
            a.info((Object)string);
        }
        this.g.println(string);
        return this.e(this.e());
    }

    private boolean g() {
        String string = this.e("PASV");
        String string2 = this.h(string);
        string2 = string2.substring(string2.indexOf("(") + 1, string2.indexOf(")"));
        String[] stringArray = string2.split(",");
        int n = Integer.parseInt(stringArray[4]);
        int n2 = Integer.parseInt(stringArray[5]);
        int n3 = n * 256 + n2;
        String string3 = stringArray[0] + "." + stringArray[1] + "." + stringArray[2] + "." + stringArray[3];
        this.f = new Socket(string3, n3);
        return this.e(Integer.parseInt(string.substring(0, 3)));
    }

    private boolean c(int n) {
        return n >= 100 && n < 200;
    }

    private boolean d(int n) {
        return n >= 300 && n < 400;
    }

    private boolean e(int n) {
        return n >= 200 && n < 300 || n == 150;
    }

    private String h(String string) {
        if (string.length() < 5) {
            return string;
        }
        return string.substring(4);
    }

    protected Socket d() {
        return this.e;
    }

    public void b(int n) {
        this.m = n;
    }

    public void a(File file) {
        this.o = file;
    }
}

