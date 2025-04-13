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

/*
 * Renamed from ji
 */
public final class ji_0
extends GeneratedMessageV3.Builder<ji_0>
implements jj_0 {
    private int a;
    private long b;
    private long c;
    private Object d = "";
    private int e;
    private boolean f;
    private boolean g;
    private List<iy_0> h = Collections.emptyList();
    private RepeatedFieldBuilderV3<iy_0, ja, jb_0> i;
    private ja_0 j = null;
    private SingleFieldBuilderV3<ja_0, jC, jD> k;
    private int l;
    private boolean m;

    public static final Descriptors.Descriptor a() {
        return iw_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.f.ensureFieldAccessorsInitialized(jg_0.class, ji_0.class);
    }

    ji_0() {
        this.Q();
    }

    ji_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.Q();
    }

    private void Q() {
        if (jg_0.E()) {
            this.S();
            this.T();
        }
    }

    public ji_0 y() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = "";
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = false;
        this.a &= 0xFFFFFFEF;
        this.g = false;
        this.a &= 0xFFFFFFDF;
        if (this.i == null) {
            this.h = Collections.emptyList();
            this.a &= 0xFFFFFFBF;
        } else {
            this.i.clear();
        }
        if (this.k == null) {
            this.j = null;
        } else {
            this.k.clear();
        }
        this.a &= 0xFFFFFF7F;
        this.l = 0;
        this.a &= 0xFFFFFEFF;
        this.m = false;
        this.a &= 0xFFFFFDFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iw_0.e;
    }

    public jg_0 z() {
        return jg_0.B();
    }

    public jg_0 A() {
        jg_0 jg_02 = this.B();
        if (!jg_02.isInitialized()) {
            throw ji_0.newUninitializedMessageException((Message)jg_02);
        }
        return jg_02;
    }

    public jg_0 B() {
        jg_0 jg_02 = new jg_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        jg_02.n = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        jg_02.o = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        jg_02.p = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        jg_02.q = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        jg_02.r = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        jg_02.s = this.g;
        if (this.i == null) {
            if ((this.a & 0x40) == 64) {
                this.h = Collections.unmodifiableList(this.h);
                this.a &= 0xFFFFFFBF;
            }
            jg_02.t = this.h;
        } else {
            jg_02.t = this.i.build();
        }
        if ((n & 0x80) == 128) {
            n2 |= 0x40;
        }
        jg_02.u = this.k == null ? this.j : (ja_0)this.k.build();
        if ((n & 0x100) == 256) {
            n2 |= 0x80;
        }
        jg_02.v = this.l;
        if ((n & 0x200) == 512) {
            n2 |= 0x100;
        }
        jg_02.w = this.m;
        jg_02.m = n2;
        this.onBuilt();
        return jg_02;
    }

    public ji_0 C() {
        return (ji_0)super.clone();
    }

    public ji_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ji_0)super.setField(fieldDescriptor, object);
    }

    public ji_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ji_0)super.clearField(fieldDescriptor);
    }

    public ji_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ji_0)super.clearOneof(oneofDescriptor);
    }

    public ji_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ji_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ji_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ji_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ji_0 a(Message message) {
        if (message instanceof jg_0) {
            return this.a((jg_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ji_0 a(jg_0 jg_02) {
        if (jg_02 == jg_0.B()) {
            return this;
        }
        if (jg_02.b()) {
            this.a(jg_02.c());
        }
        if (jg_02.d()) {
            this.b(jg_02.e());
        }
        if (jg_02.f()) {
            this.a |= 4;
            this.d = jg_02.p;
            this.onChanged();
        }
        if (jg_02.i()) {
            this.c(jg_02.j());
        }
        if (jg_02.k()) {
            this.a(jg_02.l());
        }
        if (jg_02.m()) {
            this.b(jg_02.n());
        }
        if (this.i == null) {
            if (!jg_02.t.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = jg_02.t;
                    this.a &= 0xFFFFFFBF;
                } else {
                    this.R();
                    this.h.addAll(jg_02.t);
                }
                this.onChanged();
            }
        } else if (!jg_02.t.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i.dispose();
                this.i = null;
                this.h = jg_02.t;
                this.a &= 0xFFFFFFBF;
                this.i = jg_0.F() ? this.S() : null;
            } else {
                this.i.addAllMessages(jg_02.t);
            }
        }
        if (jg_02.r()) {
            this.b(jg_02.s());
        }
        if (jg_02.u()) {
            this.g(jg_02.v());
        }
        if (jg_02.w()) {
            this.c(jg_02.x());
        }
        this.b(jg_0.b(jg_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        if (!this.i()) {
            return false;
        }
        if (!this.k()) {
            return false;
        }
        if (!this.m()) {
            return false;
        }
        for (int k = 0; k < this.q(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ji_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jg_0 jg_02 = null;
        try {
            jg_02 = (jg_0)jg_0.k.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jg_02 = (jg_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jg_02 != null) {
                this.a(jg_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public ji_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public ji_0 D() {
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
    public long e() {
        return this.c;
    }

    public ji_0 b(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public ji_0 E() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public String g() {
        Object object = this.d;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.d = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString h() {
        Object object = this.d;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.d = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ji_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = string;
        this.onChanged();
        return this;
    }

    public ji_0 F() {
        this.a &= 0xFFFFFFFB;
        this.d = jg_0.B().g();
        this.onChanged();
        return this;
    }

    public ji_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public int j() {
        return this.e;
    }

    public ji_0 c(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public ji_0 G() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public boolean l() {
        return this.f;
    }

    public ji_0 a(boolean bl) {
        this.a |= 0x10;
        this.f = bl;
        this.onChanged();
        return this;
    }

    public ji_0 H() {
        this.a &= 0xFFFFFFEF;
        this.f = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean m() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public boolean n() {
        return this.g;
    }

    public ji_0 b(boolean bl) {
        this.a |= 0x20;
        this.g = bl;
        this.onChanged();
        return this;
    }

    public ji_0 I() {
        this.a &= 0xFFFFFFDF;
        this.g = false;
        this.onChanged();
        return this;
    }

    private void R() {
        if ((this.a & 0x40) != 64) {
            this.h = new ArrayList<iy_0>(this.h);
            this.a |= 0x40;
        }
    }

    @Override
    public List<iy_0> o() {
        if (this.i == null) {
            return Collections.unmodifiableList(this.h);
        }
        return this.i.getMessageList();
    }

    @Override
    public int q() {
        if (this.i == null) {
            return this.h.size();
        }
        return this.i.getCount();
    }

    @Override
    public iy_0 a(int n) {
        if (this.i == null) {
            return this.h.get(n);
        }
        return (iy_0)this.i.getMessage(n);
    }

    public ji_0 a(int n, iy_0 iy_02) {
        if (this.i == null) {
            if (iy_02 == null) {
                throw new NullPointerException();
            }
            this.R();
            this.h.set(n, iy_02);
            this.onChanged();
        } else {
            this.i.setMessage(n, (AbstractMessage)iy_02);
        }
        return this;
    }

    public ji_0 a(int n, ja ja2) {
        if (this.i == null) {
            this.R();
            this.h.set(n, ja2.l());
            this.onChanged();
        } else {
            this.i.setMessage(n, (AbstractMessage)ja2.l());
        }
        return this;
    }

    public ji_0 a(iy_0 iy_02) {
        if (this.i == null) {
            if (iy_02 == null) {
                throw new NullPointerException();
            }
            this.R();
            this.h.add(iy_02);
            this.onChanged();
        } else {
            this.i.addMessage((AbstractMessage)iy_02);
        }
        return this;
    }

    public ji_0 b(int n, iy_0 iy_02) {
        if (this.i == null) {
            if (iy_02 == null) {
                throw new NullPointerException();
            }
            this.R();
            this.h.add(n, iy_02);
            this.onChanged();
        } else {
            this.i.addMessage(n, (AbstractMessage)iy_02);
        }
        return this;
    }

    public ji_0 a(ja ja2) {
        if (this.i == null) {
            this.R();
            this.h.add(ja2.l());
            this.onChanged();
        } else {
            this.i.addMessage((AbstractMessage)ja2.l());
        }
        return this;
    }

    public ji_0 b(int n, ja ja2) {
        if (this.i == null) {
            this.R();
            this.h.add(n, ja2.l());
            this.onChanged();
        } else {
            this.i.addMessage(n, (AbstractMessage)ja2.l());
        }
        return this;
    }

    public ji_0 a(Iterable<? extends iy_0> iterable) {
        if (this.i == null) {
            this.R();
            AbstractMessageLite.Builder.addAll(iterable, this.h);
            this.onChanged();
        } else {
            this.i.addAllMessages(iterable);
        }
        return this;
    }

    public ji_0 J() {
        if (this.i == null) {
            this.h = Collections.emptyList();
            this.a &= 0xFFFFFFBF;
            this.onChanged();
        } else {
            this.i.clear();
        }
        return this;
    }

    public ji_0 d(int n) {
        if (this.i == null) {
            this.R();
            this.h.remove(n);
            this.onChanged();
        } else {
            this.i.remove(n);
        }
        return this;
    }

    public ja e(int n) {
        return (ja)this.S().getBuilder(n);
    }

    @Override
    public jb_0 b(int n) {
        if (this.i == null) {
            return this.h.get(n);
        }
        return (jb_0)this.i.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jb_0> p() {
        if (this.i != null) {
            return this.i.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.h);
    }

    public ja K() {
        return (ja)this.S().addBuilder((AbstractMessage)iy_0.m());
    }

    public ja f(int n) {
        return (ja)this.S().addBuilder(n, (AbstractMessage)iy_0.m());
    }

    public List<ja> L() {
        return this.S().getBuilderList();
    }

    private RepeatedFieldBuilderV3<iy_0, ja, jb_0> S() {
        if (this.i == null) {
            this.i = new RepeatedFieldBuilderV3(this.h, (this.a & 0x40) == 64, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.h = null;
        }
        return this.i;
    }

    @Override
    public boolean r() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public ja_0 s() {
        if (this.k == null) {
            return this.j == null ? ja_0.s() : this.j;
        }
        return (ja_0)this.k.getMessage();
    }

    public ji_0 a(ja_0 ja_02) {
        if (this.k == null) {
            if (ja_02 == null) {
                throw new NullPointerException();
            }
            this.j = ja_02;
            this.onChanged();
        } else {
            this.k.setMessage((AbstractMessage)ja_02);
        }
        this.a |= 0x80;
        return this;
    }

    public ji_0 a(jC jC2) {
        if (this.k == null) {
            this.j = jC2.r();
            this.onChanged();
        } else {
            this.k.setMessage((AbstractMessage)jC2.r());
        }
        this.a |= 0x80;
        return this;
    }

    public ji_0 b(ja_0 ja_02) {
        if (this.k == null) {
            this.j = (this.a & 0x80) == 128 && this.j != null && this.j != ja_0.s() ? ja_0.a(this.j).a(ja_02).s() : ja_02;
            this.onChanged();
        } else {
            this.k.mergeFrom((AbstractMessage)ja_02);
        }
        this.a |= 0x80;
        return this;
    }

    public ji_0 M() {
        if (this.k == null) {
            this.j = null;
            this.onChanged();
        } else {
            this.k.clear();
        }
        this.a &= 0xFFFFFF7F;
        return this;
    }

    public jC N() {
        this.a |= 0x80;
        this.onChanged();
        return (jC)this.T().getBuilder();
    }

    @Override
    public jD t() {
        if (this.k != null) {
            return (jD)this.k.getMessageOrBuilder();
        }
        return this.j == null ? ja_0.s() : this.j;
    }

    private SingleFieldBuilderV3<ja_0, jC, jD> T() {
        if (this.k == null) {
            this.k = new SingleFieldBuilderV3((AbstractMessage)this.s(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.j = null;
        }
        return this.k;
    }

    @Override
    public boolean u() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public int v() {
        return this.l;
    }

    public ji_0 g(int n) {
        this.a |= 0x100;
        this.l = n;
        this.onChanged();
        return this;
    }

    public ji_0 O() {
        this.a &= 0xFFFFFEFF;
        this.l = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean w() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public boolean x() {
        return this.m;
    }

    public ji_0 c(boolean bl) {
        this.a |= 0x200;
        this.m = bl;
        this.onChanged();
        return this;
    }

    public ji_0 P() {
        this.a &= 0xFFFFFDFF;
        this.m = false;
        this.onChanged();
        return this;
    }

    public final ji_0 a(UnknownFieldSet unknownFieldSet) {
        return (ji_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ji_0 b(UnknownFieldSet unknownFieldSet) {
        return (ji_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.y();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.C();
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
        return this.y();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.C();
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
        return this.C();
    }

    public /* synthetic */ Message buildPartial() {
        return this.B();
    }

    public /* synthetic */ Message build() {
        return this.A();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.C();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.B();
    }

    public /* synthetic */ MessageLite build() {
        return this.A();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.y();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.z();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.z();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.C();
    }

    public /* synthetic */ Object clone() {
        return this.C();
    }
}

