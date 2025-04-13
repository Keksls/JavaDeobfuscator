/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uk.co.caprica.vlcj.player.MediaPlayer
 *  uk.co.caprica.vlcj.player.MediaPlayerEventAdapter
 */
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventAdapter;

class fvu
extends MediaPlayerEventAdapter {
    final /* synthetic */ fvs_0 a;

    fvu(fvs_0 fvs_02) {
        this.a = fvs_02;
    }

    public void error(MediaPlayer mediaPlayer) {
        System.err.println("Some error");
    }
}

