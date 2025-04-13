/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.kohsuke.args4j.Option
 */
import org.kohsuke.args4j.Option;

public final class aNB {
    @Option(name="-c", aliases={"--config-file-path"}, usage="Configuration file path")
    @emo(a="WAKFU_CONFIG_FILE_PATH")
    private String a;
    @Option(name="-p", aliases={"--pref-file-directory", "--data-dir"}, usage="Directory containing preferences files")
    @emo(a="WAKFU_PREF_FILE_DIRECTORY")
    private String b;
    @Option(name="-n", aliases={"--cache-file-directory-"}, usage="Directory containing cache files")
    @emo(a="WAKFU_CACHE_FILE_DIRECTORY")
    private String c;
    @Option(name="-L", aliases={"--lang"}, usage="Language code for session")
    @emo(a="WAKFU_LANGUAGE")
    private String d;
    @Option(name="-C", aliases={"--country"}, usage="Country code for session")
    private String e;
    @Option(name="--install-folder", usage="Local path of installation")
    private String f;
    @Option(name="--updater-service-port", usage="Port to use for communication with updater", hidden=true)
    private int g;
    @Option(name="--update-state", usage="Initial update state (updating, uptodate) to consider", hidden=true)
    private String h;
    @Option(name="-P", aliases={"--active-profiler"}, usage="Active profiler", hidden=true)
    private boolean i;
    @Option(name="-T", aliases={"--particle-light-debug"}, usage="Active debugging of particle and light", hidden=true)
    private boolean j;
    @Option(name="-R", aliases={"--render-tree-debug"}, usage="Active debugging of render tree", hidden=true)
    private boolean k;
    @Option(name="-M", aliases={"--mem-pool-objects-debug"}, usage="Active debugging of memory pool objects", hidden=true)
    private boolean l;
    @Option(name="-t", aliases={"--pathfinding-debug"}, usage="Active debugging of pathfinding", hidden=true)
    private boolean m;
    @Option(name="-ugl", aliases={"--show-unsupported-gl-dialog"}, usage="Show unsupported GL Dialog", hidden=true)
    private boolean n;
    @Option(name="-esdl", aliases={"--enable-shopi-debug-logs"}, usage="Enable additionnal logs related to Shopi", hidden=true)
    private boolean o;
    @Option(name="-ewtdl", aliases={"--enable-web-tokens-debug-logs"}, usage="Enable additionnal logs related to Web tokens", hidden=true)
    private boolean p;
    @Option(name="-dscdoe", aliases={"--disable-shopi-cart-deletion-on-error"}, usage="Disable deletion of cart after an error during shopi process", hidden=true)
    private boolean q;
    @Option(name="-su", aliases={"--shop-used"}, usage="Specify shop to use (default: Use shop specified in sysconf) (values: '', haapi, shopi)", hidden=true)
    private String r;
    @Option(name="-exdll", aliases={"--enable-xulor-dialog-load-logs"}, usage="Enable xulor logs about load of dialogs", hidden=true)
    private boolean s;
    @Option(name="-doglc", aliases={"--debug-opengl-calls"}, usage="Enable debug of OpenGL calls", hidden=true)
    private boolean t;
    @Option(name="-tffoglc", aliases={"--trace-file-for-opengl-calls"}, usage="File used to trace OpenGL calls", hidden=true)
    private String u;
    @Option(name="--partner", usage="Partner (values : steam)", hidden=true)
    private String v;
    @Option(name="--app-id", usage="Use by updater to identify clients")
    private String w;

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public boolean f() {
        return this.i;
    }

    public boolean g() {
        return this.j;
    }

    public boolean h() {
        return this.k;
    }

    boolean i() {
        return this.l;
    }

    public boolean j() {
        return this.m;
    }

    String k() {
        return this.f;
    }

    public int l() {
        return this.g;
    }

    public String m() {
        return this.h;
    }

    public String n() {
        return this.v;
    }

    public boolean o() {
        return this.n;
    }

    public boolean p() {
        return this.o;
    }

    public boolean q() {
        return this.p;
    }

    public boolean r() {
        return this.q;
    }

    public String s() {
        return this.r;
    }

    public boolean t() {
        return this.s;
    }

    public boolean u() {
        return this.t;
    }

    public boolean v() {
        return this.w() != null;
    }

    public String w() {
        return this.u;
    }
}

