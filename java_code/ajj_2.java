/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aJj
 */
public class ajj_2 {
    public static final short a = 1;
    public static final short b = 0;
    public static final int c = 6881;
    public static final int d = 6999;
    public final String e;
    public String f;
    public ais_2 g;
    public ajg_2 h;
    public aja_2 i;
    public aio_2 j;
    public ajl_1 k;
    private final File D;
    private aji_2 E;
    protected int l;
    protected int m;
    protected final String n;
    protected final ajh_2 o;
    protected final aiq_2 p;
    protected byte[] q = new byte[20];
    protected ServerSocket r;
    protected static final byte s = 3;
    protected int t = 0;
    public static final String[] u = new String[]{"Pas d\u00e9marr\u00e9", "Network setup", "Recherche des torrent", "Creation torrent", "V\u00e9rification de la m\u00e9moire allou\u00e9e", "R\u00e9cup\u00e9ration des pieces", "Partage"};
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 4;
    public static final int A = 5;
    public static final int B = 6;
    protected static final Logger C = Logger.getLogger("com.ankamagames.framework.net.torrent.torrentMainApp");

    public ajj_2(String string, String string2, int n, ajh_2 ajh_22, aiq_2 aiq_22) {
        this.o = ajh_22;
        this.p = aiq_22;
        this.e = string;
        this.D = new File(string);
        this.l = n;
        this.n = string2;
        Random random = new Random();
        byte[] byArray = new byte[20];
        byArray[0] = 45;
        byArray[1] = 65;
        byArray[2] = 71;
        byArray[3] = 49;
        byArray[4] = 48;
        byArray[5] = 48;
        byArray[6] = 48;
        byArray[7] = 45;
        for (int k = 8; k < 20; ++k) {
            byArray[k] = (byte)random.nextInt(256);
        }
        C.info("Peer id: " + ajc_2.a(byArray));
    }

    public ajj_2(String string, String string2, int n, ajh_2 ajh_22, aiq_2 aiq_22, aji_2 aji_22) {
        this.o = ajh_22;
        this.p = aiq_22;
        this.e = string;
        this.D = new File(string);
        this.l = n;
        this.n = string2;
        this.E = aji_22;
        Random random = new Random();
        this.q = new byte[20];
        this.q[0] = 45;
        this.q[1] = 65;
        this.q[2] = 71;
        this.q[3] = 49;
        this.q[4] = 48;
        this.q[5] = 48;
        this.q[6] = 48;
        this.q[7] = 45;
        for (int k = 8; k < 20; ++k) {
            this.q[k] = (byte)random.nextInt(256);
        }
        C.info("My Peer id: " + ajc_2.a(this.q));
    }

    public static void a(Level level) {
        C.setLevel(level);
        C.setUseParentHandlers(false);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(level);
        C.addHandler(consoleHandler);
    }

    public String a() {
        return u[this.t];
    }

    public int b() {
        return this.t;
    }

    public aio_2 c() {
        return this.j;
    }

    public ajl_1 d() {
        return this.k;
    }

    public String e() {
        return this.e;
    }

    public int f() {
        return this.m;
    }

    public String g() {
        return this.f;
    }

    public void h() {
        Object object;
        this.t = 1;
        IOException iOException = null;
        if (this.l != -1) {
            this.m = this.l;
            try {
                this.r = new ServerSocket(this.m);
            }
            catch (IOException iOException2) {
                iOException = iOException2;
            }
        } else {
            this.m = 6881;
            while (this.r == null && this.m <= 6999) {
                try {
                    this.r = new ServerSocket(this.m);
                }
                catch (IOException iOException3) {
                    iOException = iOException3;
                }
                ++this.m;
            }
        }
        if (this.r == null) {
            object = "Impossible d'accepter les connections entrantes ";
            object = this.l == -1 ? (String)object + "des ports 6881 - 6999" : (String)object + "du port " + this.l;
            if (this.n != null || this.l != -1) {
                ajj_2.a((String)object, iOException);
            } else {
                C.log(Level.WARNING, (String)object);
            }
            this.m = -1;
        } else {
            this.m = this.r.getLocalPort();
            this.l = this.r.getLocalPort();
            C.log(Level.FINE, "Listage du port : " + this.m);
        }
        this.g = null;
        object = null;
        try {
            InputStream inputStream;
            object = new File(this.e);
            if (((File)object).exists()) {
                inputStream = new FileInputStream((File)object);
            } else {
                int n;
                this.t = 2;
                URL uRL = new URL(this.e);
                URLConnection uRLConnection = uRL.openConnection();
                uRLConnection.connect();
                inputStream = uRLConnection.getInputStream();
                if (uRLConnection instanceof HttpURLConnection && (n = ((HttpURLConnection)uRLConnection).getResponseCode()) / 100 != 2) {
                    ajj_2.a("Chargement de '" + this.e + "' renvoie un code d'erreur " + n + ", il se pourrait fortement qu'elle n'existe pas");
                }
            }
            this.g = new ais_2(new ajn_1(inputStream));
        }
        catch (IOException iOException4) {
            if (((File)object).exists()) {
                if (this.n == null) {
                    ajj_2.a("'" + this.e + "' existe, mais n'est pas un fichier torrent valide." + System.getProperty("line.separator") + "  (utilisez --share pour cr\u00e9er un fichier torrent et commencer le partage)", iOException4);
                } else {
                    C.log(Level.INFO, "Trying to create metainfo torrent for '" + this.e + "'");
                    try {
                        this.t = 3;
                        this.h = new ajg_2((File)object, "http://" + this.n + ":" + this.m + "/announce", this.o);
                        this.h.a();
                        this.g = this.h.b();
                    }
                    catch (IOException iOException5) {
                        ajj_2.a("Could not create torrent for '" + this.e + "'", iOException5);
                    }
                }
            }
            ajj_2.a("Cannot open '" + this.e + "'", iOException4);
        }
        this.l = this.m;
        C.log(Level.INFO, this.g.toString());
    }

    public int a(URL uRL) {
        try {
            uRL.openConnection();
        }
        catch (IOException iOException) {
            C.log(Level.SEVERE, "Exception", iOException);
        }
        return this.a(new File(uRL.getFile()));
    }

    public int a(File file) {
        Object object;
        Object object2;
        Object object3;
        this.f = file.getAbsolutePath();
        this.t = 1;
        IOException iOException = null;
        if (this.l != -1) {
            this.m = this.l;
            try {
                this.r = new ServerSocket(this.m);
            }
            catch (IOException iOException2) {
                iOException = iOException2;
            }
        } else {
            this.m = 6881;
            while (this.r == null && this.m <= 6999) {
                try {
                    this.r = new ServerSocket(this.m);
                }
                catch (IOException iOException3) {
                    iOException = iOException3;
                }
                ++this.m;
            }
        }
        if (this.r == null) {
            object3 = "Impossible d'accepter les connections entrantes venant de ";
            object3 = this.l == -1 ? (String)object3 + "ces ports 6881 - 6999" : (String)object3 + "du port " + this.l;
            if (this.n != null || this.l != -1) {
                System.err.println((String)object3 + " : " + iOException);
            } else {
                C.log(Level.WARNING, (String)object3);
            }
            this.m = -1;
        } else {
            this.m = this.r.getLocalPort();
            C.log(Level.FINE, "Listage du port : " + this.m);
        }
        this.g = null;
        object3 = null;
        try {
            object3 = new File(this.e);
            if (((File)object3).exists()) {
                object2 = new FileInputStream((File)object3);
            } else {
                int n;
                this.t = 2;
                object = new URL(this.e);
                URLConnection uRLConnection = ((URL)object).openConnection();
                uRLConnection.connect();
                object2 = uRLConnection.getInputStream();
                if (uRLConnection instanceof HttpURLConnection && (n = ((HttpURLConnection)uRLConnection).getResponseCode()) / 100 != 2) {
                    ajj_2.a("Chargement de '" + this.e + "' renvoie un code d'erreur " + n + ", il se pourrait fortement qu'elle n'existe pas");
                }
            }
            this.g = new ais_2(new ajn_1((InputStream)object2));
        }
        catch (IOException iOException4) {
            if (((File)object3).exists()) {
                System.err.println("'" + this.e + "' existe, mais n'est pas un fichier torrent correcte." + System.getProperty("line.separator") + "  (utilisez --share pour cr\u00e9er un torrent et commencer le partager) : " + iOException4);
            }
            System.err.println("Impossible d'ouvrir '" + this.e + "' : " + iOException4);
        }
        C.log(Level.INFO, this.g.toString());
        if (this.h == null) {
            try {
                this.t = 4;
                this.h = new ajg_2(this.g, file, this.o);
                this.h.a(null, null, -1);
            }
            catch (IOException iOException5) {
                System.err.println("Impossible d'allouer la m\u00e9moire : " + iOException5);
            }
            catch (aie_2 aie_22) {
                C.log(Level.SEVERE, "Exception", aie_22);
            }
        }
        this.t = 5;
        this.i = new aja_2(this.q, this.g, this.h, this.p);
        object2 = new aiv_2(this.i);
        object = new aio_2(this.r, (aiv_2)object2);
        ((aio_2)object).a();
        if (this.n != null) {
            C.log(Level.INFO, "Torrent disponible sur http://" + this.n + ":" + this.m + "/" + this.g.c() + ".torrent");
        }
        this.k = new ajl_1(null, this.g, this.i, this.m);
        this.k.start();
        this.i.a(this.k);
        return 0;
    }

    public int b(File file) {
        Object object;
        if (this.l == -1) {
            System.err.println("[ERROR] : port non valide");
            return -1;
        }
        this.m = this.l;
        this.g = null;
        File file2 = null;
        try {
            file2 = new File(this.e);
            if (!file2.exists()) {
                System.err.println("[ERROR] : fichier non existant");
                return -1;
            }
            object = new FileInputStream(file2);
            this.g = new ais_2(new ajn_1((InputStream)object));
        }
        catch (IOException iOException) {
            if (file2.exists()) {
                C.log(Level.INFO, "Trying to create metainfo torrent for '" + this.e + "'");
                try {
                    this.t = 3;
                    this.h = new ajg_2(file2, "http://" + this.n + ":" + this.m + "/announce", this.o);
                    this.h.a();
                    this.g = this.h.b();
                }
                catch (IOException iOException2) {
                    System.out.println("Could not create torrent for '" + this.e + "' : " + iOException2);
                    return -1;
                }
            }
            System.out.println("Cannot open '" + this.e + "' : " + iOException);
            return -1;
        }
        C.log(Level.INFO, this.g.toString());
        this.t = 5;
        if (this.n != null) {
            object = this.g.a("http://" + this.n + ":" + this.m + "/announce");
            ajk_1 ajk_12 = new ajk_1((ais_2)object);
            try {
                ajk_12.a(this.g.c(), new ajc_2(this.q, InetAddress.getByName(this.n), this.m));
            }
            catch (UnknownHostException unknownHostException) {
                C.log(Level.SEVERE, "Exception", unknownHostException);
                return -1;
            }
            byte[] byArray = ajk_12.a(this.g.c()).j();
            try {
                C.log(Level.INFO, "Writing torrent to file " + this.e + ".torrent");
                file.mkdirs();
                FileOutputStream fileOutputStream = file.getPath().endsWith(File.separator) ? new FileOutputStream(file.getPath() + this.D.getName() + ".torrent") : new FileOutputStream(file.getPath() + File.separator + this.D.getName() + ".torrent");
                fileOutputStream.write(byArray);
                fileOutputStream.close();
                C.log(Level.INFO, "Torrent available on " + file.getPath() + this.D.getName() + ".torrent");
                return 0;
            }
            catch (IOException iOException) {
                C.log(Level.WARNING, "Could not save torrent file.");
                return -1;
            }
        }
        return -1;
    }

    public void c(File file) {
        Object object;
        Object object2;
        if (this.h == null) {
            try {
                this.t = 4;
                this.h = new ajg_2(this.g, file, this.o);
                System.err.println("\n<======Check de base du fichier======>");
                this.h.a(null, null, -1);
            }
            catch (IOException iOException) {
                if (!iOException.getMessage().contains("Espace insuffisant sur le disque")) {
                    ajj_2.a("Impossible d'allouer l'espace m\u00e9moire", iOException);
                } else {
                    ajj_2.a("Impossible d'allouer l'espace m\u00e9moire : espace disque insuffisant");
                }
            }
            catch (aie_2 aie_22) {
                C.log(Level.SEVERE, "Exception", aie_22);
            }
        }
        this.t = 5;
        this.i = new aja_2(this.q, this.g, this.h, this.p);
        if (this.n != null) {
            object2 = this.g.a("http://" + this.n + ":" + this.m + "/announce");
            object = new ajk_1((ais_2)object2);
            try {
                ((ajk_1)object).a(this.g.c(), new ajc_2(this.q, InetAddress.getByName(this.n), this.m));
            }
            catch (UnknownHostException unknownHostException) {
                ajj_2.a("Impossible de d\u00e9marrer le tracker pour " + this.n, unknownHostException);
            }
            byte[] byArray = ((ajk_1)object).a(this.g.c()).j();
            try {
                C.log(Level.INFO, "Writing torrent to file " + this.e + ".torrent");
                FileOutputStream fileOutputStream = new FileOutputStream(this.e + ".torrent");
                fileOutputStream.write(byArray);
                fileOutputStream.close();
            }
            catch (IOException iOException) {
                C.log(Level.WARNING, "Impossible d'enregistrer le torrent.");
            }
        }
        object2 = new aiv_2(this.i);
        object = new aio_2(this.r, (aiv_2)object2);
        ((aio_2)object).a();
        if (this.n != null) {
            C.log(Level.INFO, "Torrent disponible sur http://" + this.n + ":" + this.m + "/" + this.g.c() + ".torrent");
        }
        this.k = new ajl_1(this.E == null ? null : this.E, this.g, this.i, this.m);
        this.k.start();
        this.i.a(this.k);
    }

    public static void a(String string) {
        ajj_2.a(string, null);
    }

    public static void a(String string, IOException iOException) {
        C.log(Level.SEVERE, string, iOException);
        throw new IOException(string);
    }

    public boolean equals(Object object) {
        if (object instanceof ajj_2) {
            return this.e().equals(((ajj_2)object).e());
        }
        return super.equals(object);
    }
}

