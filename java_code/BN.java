/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BN
extends GeneratedMessageV3.Builder<BN>
implements BO {
    private int a;
    private long b;
    private By c = null;
    private SingleFieldBuilderV3<By, BA, BB> d;
    private List<bc_0> e = Collections.emptyList();
    private RepeatedFieldBuilderV3<bc_0, BE, bf_0> f;
    private long g;
    private List<AY> h = Collections.emptyList();
    private RepeatedFieldBuilderV3<AY, ba_0, bb_0> i;
    private Object j = "";

    public static final Descriptors.Descriptor a() {
        return AO.q;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.r.ensureFieldAccessorsInitialized(bl_0.class, BN.class);
    }

    BN() {
        this.H();
    }

    BN(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.H();
    }

    private void H() {
        if (bl_0.x()) {
            this.I();
            this.K();
            this.M();
        }
    }

    public BN r() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
        } else {
            this.f.clear();
        }
        this.g = 0L;
        this.a &= 0xFFFFFFF7;
        if (this.i == null) {
            this.h = Collections.emptyList();
            this.a &= 0xFFFFFFEF;
        } else {
            this.i.clear();
        }
        this.j = "";
        this.a &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return AO.q;
    }

    public bl_0 s() {
        return bl_0.u();
    }

    public bl_0 t() {
        bl_0 bl_02 = this.u();
        if (!bl_02.isInitialized()) {
            throw BN.newUninitializedMessageException((Message)bl_02);
        }
        return bl_02;
    }

    public bl_0 u() {
        bl_0 bl_02 = new bl_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        bl_02.j = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        bl_02.k = this.d == null ? this.c : (By)this.d.build();
        if (this.f == null) {
            if ((this.a & 4) == 4) {
                this.e = Collections.unmodifiableList(this.e);
                this.a &= 0xFFFFFFFB;
            }
            bl_02.l = this.e;
        } else {
            bl_02.l = this.f.build();
        }
        if ((n & 8) == 8) {
            n2 |= 4;
        }
        bl_02.m = this.g;
        if (this.i == null) {
            if ((this.a & 0x10) == 16) {
                this.h = Collections.unmodifiableList(this.h);
                this.a &= 0xFFFFFFEF;
            }
            bl_02.n = this.h;
        } else {
            bl_02.n = this.i.build();
        }
        if ((n & 0x20) == 32) {
            n2 |= 8;
        }
        bl_02.o = this.j;
        bl_02.i = n2;
        this.onBuilt();
        return bl_02;
    }

    public BN v() {
        return (BN)super.clone();
    }

    public BN a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (BN)super.setField(fieldDescriptor, object);
    }

    public BN a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (BN)super.clearField(fieldDescriptor);
    }

    public BN a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (BN)super.clearOneof(oneofDescriptor);
    }

    public BN a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (BN)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public BN b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (BN)super.addRepeatedField(fieldDescriptor, object);
    }

    public BN a(Message message) {
        if (message instanceof bl_0) {
            return this.a((bl_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public BN a(bl_0 bl_02) {
        if (bl_02 == bl_0.u()) {
            return this;
        }
        if (bl_02.b()) {
            this.a(bl_02.c());
        }
        if (bl_02.d()) {
            this.b(bl_02.e());
        }
        if (this.f == null) {
            if (!bl_02.l.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = bl_02.l;
                    this.a &= 0xFFFFFFFB;
                } else {
                    this.J();
                    this.e.addAll(bl_02.l);
                }
                this.onChanged();
            }
        } else if (!bl_02.l.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f.dispose();
                this.f = null;
                this.e = bl_02.l;
                this.a &= 0xFFFFFFFB;
                this.f = bl_0.y() ? this.K() : null;
            } else {
                this.f.addAllMessages(bl_02.l);
            }
        }
        if (bl_02.j()) {
            this.b(bl_02.k());
        }
        if (this.i == null) {
            if (!bl_02.n.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = bl_02.n;
                    this.a &= 0xFFFFFFEF;
                } else {
                    this.L();
                    this.h.addAll(bl_02.n);
                }
                this.onChanged();
            }
        } else if (!bl_02.n.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i.dispose();
                this.i = null;
                this.h = bl_02.n;
                this.a &= 0xFFFFFFEF;
                this.i = bl_0.z() ? this.M() : null;
            } else {
                this.i.addAllMessages(bl_02.n);
            }
        }
        if (bl_02.o()) {
            this.a |= 0x20;
            this.j = bl_02.o;
            this.onChanged();
        }
        this.b(bl_0.b(bl_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.d()) {
            return false;
        }
        if (!this.e().isInitialized()) {
            return false;
        }
        for (n = 0; n < this.i(); ++n) {
            if (this.a(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.n(); ++n) {
            if (this.c(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public BN a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bl_0 bl_02 = null;
        try {
            bl_02 = (bl_0)bl_0.g.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bl_02 = (bl_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bl_02 != null) {
                this.a(bl_02);
            }
        }
        return this;
    }

    @Override
    @Deprecated
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    @Deprecated
    public long c() {
        return this.b;
    }

    @Deprecated
    public BN a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    @Deprecated
    public BN w() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public By e() {
        if (this.d == null) {
            return this.c == null ? By.i() : this.c;
        }
        return (By)this.d.getMessage();
    }

    public BN a(By by) {
        if (this.d == null) {
            if (by == null) {
                throw new NullPointerException();
            }
            this.c = by;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)by);
        }
        this.a |= 2;
        return this;
    }

    public BN a(BA bA) {
        if (this.d == null) {
            this.c = bA.h();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)bA.h());
        }
        this.a |= 2;
        return this;
    }

    public BN b(By by) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != By.i() ? By.a(this.c).a(by).i() : by;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)by);
        }
        this.a |= 2;
        return this;
    }

    public BN x() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public BA y() {
        this.a |= 2;
        this.onChanged();
        return (BA)this.I().getBuilder();
    }

    @Override
    public BB f() {
        if (this.d != null) {
            return (BB)this.d.getMessageOrBuilder();
        }
        return this.c == null ? By.i() : this.c;
    }

    private SingleFieldBuilderV3<By, BA, BB> I() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    private void J() {
        if ((this.a & 4) != 4) {
            this.e = new ArrayList<bc_0>(this.e);
            this.a |= 4;
        }
    }

    @Override
    public List<bc_0> g() {
        if (this.f == null) {
            return Collections.unmodifiableList(this.e);
        }
        return this.f.getMessageList();
    }

    @Override
    public int i() {
        if (this.f == null) {
            return this.e.size();
        }
        return this.f.getCount();
    }

    @Override
    public bc_0 a(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (bc_0)this.f.getMessage(n);
    }

    public BN a(int n, bc_0 bc_02) {
        if (this.f == null) {
            if (bc_02 == null) {
                throw new NullPointerException();
            }
            this.J();
            this.e.set(n, bc_02);
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)bc_02);
        }
        return this;
    }

    public BN a(int n, BE bE) {
        if (this.f == null) {
            this.J();
            this.e.set(n, bE.i());
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)bE.i());
        }
        return this;
    }

    public BN a(bc_0 bc_02) {
        if (this.f == null) {
            if (bc_02 == null) {
                throw new NullPointerException();
            }
            this.J();
            this.e.add(bc_02);
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)bc_02);
        }
        return this;
    }

    public BN b(int n, bc_0 bc_02) {
        if (this.f == null) {
            if (bc_02 == null) {
                throw new NullPointerException();
            }
            this.J();
            this.e.add(n, bc_02);
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)bc_02);
        }
        return this;
    }

    public BN a(BE bE) {
        if (this.f == null) {
            this.J();
            this.e.add(bE.i());
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)bE.i());
        }
        return this;
    }

    public BN b(int n, BE bE) {
        if (this.f == null) {
            this.J();
            this.e.add(n, bE.i());
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)bE.i());
        }
        return this;
    }

    public BN a(Iterable<? extends bc_0> iterable) {
        if (this.f == null) {
            this.J();
            AbstractMessageLite.Builder.addAll(iterable, this.e);
            this.onChanged();
        } else {
            this.f.addAllMessages(iterable);
        }
        return this;
    }

    public BN z() {
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.f.clear();
        }
        return this;
    }

    public BN e(int n) {
        if (this.f == null) {
            this.J();
            this.e.remove(n);
            this.onChanged();
        } else {
            this.f.remove(n);
        }
        return this;
    }

    public BE f(int n) {
        return (BE)this.K().getBuilder(n);
    }

    @Override
    public bf_0 b(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (bf_0)this.f.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends bf_0> h() {
        if (this.f != null) {
            return this.f.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.e);
    }

    public BE A() {
        return (BE)this.K().addBuilder((AbstractMessage)bc_0.j());
    }

    public BE g(int n) {
        return (BE)this.K().addBuilder(n, (AbstractMessage)bc_0.j());
    }

    public List<BE> B() {
        return this.K().getBuilderList();
    }

    private RepeatedFieldBuilderV3<bc_0, BE, bf_0> K() {
        if (this.f == null) {
            this.f = new RepeatedFieldBuilderV3(this.e, (this.a & 4) == 4, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public long k() {
        return this.g;
    }

    public BN b(long l) {
        this.a |= 8;
        this.g = l;
        this.onChanged();
        return this;
    }

    public BN C() {
        this.a &= 0xFFFFFFF7;
        this.g = 0L;
        this.onChanged();
        return this;
    }

    private void L() {
        if ((this.a & 0x10) != 16) {
            this.h = new ArrayList<AY>(this.h);
            this.a |= 0x10;
        }
    }

    @Override
    public List<AY> l() {
        if (this.i == null) {
            return Collections.unmodifiableList(this.h);
        }
        return this.i.getMessageList();
    }

    @Override
    public int n() {
        if (this.i == null) {
            return this.h.size();
        }
        return this.i.getCount();
    }

    @Override
    public AY c(int n) {
        if (this.i == null) {
            return this.h.get(n);
        }
        return (AY)this.i.getMessage(n);
    }

    public BN a(int n, AY aY) {
        if (this.i == null) {
            if (aY == null) {
                throw new NullPointerException();
            }
            this.L();
            this.h.set(n, aY);
            this.onChanged();
        } else {
            this.i.setMessage(n, (AbstractMessage)aY);
        }
        return this;
    }

    public BN a(int n, ba_0 ba_02) {
        if (this.i == null) {
            this.L();
            this.h.set(n, ba_02.p());
            this.onChanged();
        } else {
            this.i.setMessage(n, (AbstractMessage)ba_02.p());
        }
        return this;
    }

    public BN a(AY aY) {
        if (this.i == null) {
            if (aY == null) {
                throw new NullPointerException();
            }
            this.L();
            this.h.add(aY);
            this.onChanged();
        } else {
            this.i.addMessage((AbstractMessage)aY);
        }
        return this;
    }

    public BN b(int n, AY aY) {
        if (this.i == null) {
            if (aY == null) {
                throw new NullPointerException();
            }
            this.L();
            this.h.add(n, aY);
            this.onChanged();
        } else {
            this.i.addMessage(n, (AbstractMessage)aY);
        }
        return this;
    }

    public BN a(ba_0 ba_02) {
        if (this.i == null) {
            this.L();
            this.h.add(ba_02.p());
            this.onChanged();
        } else {
            this.i.addMessage((AbstractMessage)ba_02.p());
        }
        return this;
    }

    public BN b(int n, ba_0 ba_02) {
        if (this.i == null) {
            this.L();
            this.h.add(n, ba_02.p());
            this.onChanged();
        } else {
            this.i.addMessage(n, (AbstractMessage)ba_02.p());
        }
        return this;
    }

    public BN b(Iterable<? extends AY> iterable) {
        if (this.i == null) {
            this.L();
            AbstractMessageLite.Builder.addAll(iterable, this.h);
            this.onChanged();
        } else {
            this.i.addAllMessages(iterable);
        }
        return this;
    }

    public BN D() {
        if (this.i == null) {
            this.h = Collections.emptyList();
            this.a &= 0xFFFFFFEF;
            this.onChanged();
        } else {
            this.i.clear();
        }
        return this;
    }

    public BN h(int n) {
        if (this.i == null) {
            this.L();
            this.h.remove(n);
            this.onChanged();
        } else {
            this.i.remove(n);
        }
        return this;
    }

    public ba_0 i(int n) {
        return (ba_0)this.M().getBuilder(n);
    }

    @Override
    public bb_0 d(int n) {
        if (this.i == null) {
            return this.h.get(n);
        }
        return (bb_0)this.i.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends bb_0> m() {
        if (this.i != null) {
            return this.i.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.h);
    }

    public ba_0 E() {
        return (ba_0)this.M().addBuilder((AbstractMessage)AY.q());
    }

    public ba_0 j(int n) {
        return (ba_0)this.M().addBuilder(n, (AbstractMessage)AY.q());
    }

    public List<ba_0> F() {
        return this.M().getBuilderList();
    }

    private RepeatedFieldBuilderV3<AY, ba_0, bb_0> M() {
        if (this.i == null) {
            this.i = new RepeatedFieldBuilderV3(this.h, (this.a & 0x10) == 16, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.h = null;
        }
        return this.i;
    }

    @Override
    public boolean o() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public String p() {
        Object object = this.j;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.j = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString q() {
        Object object = this.j;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.j = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public BN a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x20;
        this.j = string;
        this.onChanged();
        return this;
    }

    public BN G() {
        this.a &= 0xFFFFFFDF;
        this.j = bl_0.u().p();
        this.onChanged();
        return this;
    }

    public BN a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x20;
        this.j = byteString;
        this.onChanged();
        return this;
    }

    public final BN a(UnknownFieldSet unknownFieldSet) {
        return (BN)super.setUnknownFields(unknownFieldSet);
    }

    public final BN b(UnknownFieldSet unknownFieldSet) {
        return (BN)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.r();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.v();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.r();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.v();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.v();
    }

    public /* synthetic */ Message buildPartial() {
        return this.u();
    }

    public /* synthetic */ Message build() {
        return this.t();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.v();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.u();
    }

    public /* synthetic */ MessageLite build() {
        return this.t();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.r();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.s();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.s();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.v();
    }

    public /* synthetic */ Object clone() {
        return this.v();
    }
}

