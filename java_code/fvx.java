/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uk.co.caprica.vlcj.player.MediaPlayer
 *  uk.co.caprica.vlcj.player.MediaPlayerEventAdapter
 */
import java.util.ArrayList;
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventAdapter;

class fvx
extends MediaPlayerEventAdapter {
    final ArrayList<anm_2> a = new ArrayList();
    final /* synthetic */ fvv_0 b;

    fvx(fvv_0 fvv_02) {
        this.b = fvv_02;
    }

    public void buffering(MediaPlayer mediaPlayer, float f2) {
        for (anm_2 anm_22 : this.a) {
            anm_22.a(f2);
        }
    }

    public void videoOutput(MediaPlayer mediaPlayer, int n) {
        for (anm_2 anm_22 : this.a) {
            anm_22.c();
        }
    }

    public void finished(MediaPlayer mediaPlayer) {
        for (anm_2 anm_22 : this.a) {
            anm_22.a();
        }
        if (this.b.k != null) {
            this.b.k.run();
        }
    }

    public void stopped(MediaPlayer mediaPlayer) {
        for (anm_2 anm_22 : this.a) {
            anm_22.b();
        }
        if (this.b.k != null) {
            this.b.k.run();
        }
    }

    public void error(MediaPlayer mediaPlayer) {
        fvp.a.error((Object)"Error occured during vlc usage");
        this.stopped(mediaPlayer);
    }

    public String toString() {
        return "EventListenerProxy{m_listeners=" + this.a.size() + "}";
    }
}

