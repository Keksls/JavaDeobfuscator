/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.NativeLibrary
 *  uk.co.caprica.vlcj.player.MediaPlayerEventListener
 *  uk.co.caprica.vlcj.player.MediaPlayerFactory
 *  uk.co.caprica.vlcj.player.direct.BufferFormat
 *  uk.co.caprica.vlcj.player.direct.BufferFormatCallback
 *  uk.co.caprica.vlcj.player.direct.DirectMediaPlayer
 *  uk.co.caprica.vlcj.player.direct.RenderCallback
 *  uk.co.caprica.vlcj.player.direct.format.RV32BufferFormat
 *  uk.co.caprica.vlcj.player.events.MediaPlayerEventType
 *  uk.co.caprica.vlcj.runtime.RuntimeUtil
 */
import com.sun.jna.NativeLibrary;
import java.io.File;
import java.util.Objects;
import uk.co.caprica.vlcj.player.MediaPlayerEventListener;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.direct.BufferFormat;
import uk.co.caprica.vlcj.player.direct.BufferFormatCallback;
import uk.co.caprica.vlcj.player.direct.DirectMediaPlayer;
import uk.co.caprica.vlcj.player.direct.RenderCallback;
import uk.co.caprica.vlcj.player.direct.format.RV32BufferFormat;
import uk.co.caprica.vlcj.player.events.MediaPlayerEventType;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

/*
 * Renamed from fvv
 */
public class fvv_0
extends fvp
implements BufferFormatCallback {
    private static final long f = MediaPlayerEventType.events((MediaPlayerEventType[])new MediaPlayerEventType[]{MediaPlayerEventType.ALL});
    private DirectMediaPlayer g;
    private MediaPlayerFactory h;
    private fvo i;
    private fvx j;
    Runnable k;

    public static void a(String string) {
        MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory(new String[]{"--no-video-title-show"});
        DirectMediaPlayer directMediaPlayer = mediaPlayerFactory.newDirectMediaPlayer((BufferFormatCallback)new fvw_0(), (RenderCallback)new fvo());
        a.info((Object)"Starting load of dummy video file to prepare vlcj modules");
        directMediaPlayer.playMedia(string, new String[0]);
    }

    public BufferFormat getBufferFormat(int n, int n2) {
        return new RV32BufferFormat(n, n2);
    }

    @Override
    protected ayz_2 getVideoTextureProducer() {
        return this.i;
    }

    public void setEndedVideoRunnable(Runnable runnable) {
        this.k = runnable;
    }

    @Override
    public boolean b() {
        String string = this.getVideoPath();
        if (string == null) {
            a.error((Object)("Unable to get path for video " + this));
            return false;
        }
        if (this.g == null) {
            if (this.h == null) {
                a.error((Object)("Unable to play media " + this.getVideoPath()));
                return false;
            }
            this.g = this.h.newDirectMediaPlayer((BufferFormatCallback)this, (RenderCallback)this.i);
            this.g();
            if (!this.g.playMedia(this.getVideoPath(), new String[0])) {
                a.error((Object)("Unable to play media " + this.getVideoPath()));
                return false;
            }
        }
        this.g.play();
        return true;
    }

    @Override
    public void setSpu(int n) {
        if (this.g == null) {
            a.error((Object)"Unable to set SPU if no media player is started");
            return;
        }
        this.g.setSpu(n);
    }

    @Override
    public boolean a(boolean bl) {
        if (this.g == null) {
            return false;
        }
        this.g.setPause(bl);
        return true;
    }

    @Override
    public boolean c() {
        if (this.g == null) {
            return false;
        }
        this.g.stop();
        return true;
    }

    @Override
    public long getVideoDuration() {
        return this.g != null ? this.g.getLength() : 0L;
    }

    @Override
    public void a(float f2) {
        if (this.g == null) {
            return;
        }
        if (!this.g.isSeekable()) {
            return;
        }
        this.g.setPosition(f2);
    }

    @Override
    protected void b(float f2) {
        if (this.g == null) {
            return;
        }
        this.g.setVolume(Math.round(f2 * 100.0f));
    }

    @Override
    protected long getVideoPosition() {
        if (this.g == null) {
            return 0L;
        }
        return this.g.getTime();
    }

    @Override
    public void a(anm_2 anm_22) {
        if (this.j == null) {
            this.j = new fvx(this);
        }
        this.j.a.add(anm_22);
        this.g();
    }

    private void g() {
        if (this.g == null || this.j == null) {
            return;
        }
        this.g.removeMediaPlayerEventListener((MediaPlayerEventListener)this.j);
        this.g.addMediaPlayerEventListener((MediaPlayerEventListener)this.j);
        this.g.enableEvents(f);
    }

    @Override
    public void setDebugMode(boolean bl) {
        if (this.getDebugMode() == bl) {
            return;
        }
        super.setDebugMode(bl);
        this.c();
        this.f();
        this.e();
        this.d();
    }

    @Override
    public void setVideoPath(String string) {
        String string2 = this.getVideoPath();
        if (Objects.equals(string2, string)) {
            return;
        }
        super.setVideoPath(string);
        this.c();
        this.f();
    }

    public void d() {
        try {
            this.h = new MediaPlayerFactory(new String[]{"--no-video-title-show", this.getDebugMode() ? "-vvv" : ""});
        }
        catch (RuntimeException runtimeException) {
            a.error((Object)"Error on initialize of MediaPlayerFactory : ", (Throwable)runtimeException);
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.d();
        this.i = new fvo();
    }

    public void e() {
        if (this.h != null) {
            this.h.release();
            this.h = null;
        }
    }

    public void f() {
        if (this.g != null) {
            try {
                this.g.release();
            }
            catch (Error error) {
                a.error((Object)"Error when releasing VLC media player", (Throwable)error);
            }
            finally {
                this.g = null;
            }
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.c();
        this.f();
        this.e();
        if (this.j != null) {
            this.j.a.clear();
            this.j = null;
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fvp fvp2 = (fvp)fyo2;
        fvp2.setVideoPath(this.getVideoPath());
        fvp2.setDebugMode(this.getDebugMode());
    }

    static {
        try {
            File file = new File(System.getProperty("java.library.path") + "/vlc-" + ahu_2.a().d());
            NativeLibrary.addSearchPath((String)RuntimeUtil.getLibVlcLibraryName(), (String)file.getAbsolutePath());
            System.load(file.getAbsolutePath() + "/" + RuntimeUtil.getLibVlcCoreName());
        }
        catch (Throwable throwable) {
            a.error((Object)"Throwable pendant le chargement des natives de VLC : ", throwable);
        }
    }
}

