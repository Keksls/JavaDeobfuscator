/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 * Renamed from je
 */
public final class je_0
extends GeneratedMessageV3.Builder<je_0>
implements jf_0 {
    private int a;
    private long b;
    private long c;
    private int d;
    private List<iy_0> e = Collections.emptyList();
    private RepeatedFieldBuilderV3<iy_0, ja, jb_0> f;
    private ja_0 g = null;
    private SingleFieldBuilderV3<ja_0, jC, jD> h;
    private int i;

    public static final Descriptors.Descriptor a() {
        return iw_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.h.ensureFieldAccessorsInitialized(jc_0.class, je_0.class);
    }

    je_0() {
        this.D();
    }

    je_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jc_0.v()) {
            this.F();
            this.G();
        }
    }

    public je_0 p() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFF7;
        } else {
            this.f.clear();
        }
        if (this.h == null) {
            this.g = null;
        } else {
            this.h.clear();
        }
        this.a &= 0xFFFFFFEF;
        this.i = 0;
        this.a &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iw_0.g;
    }

    public jc_0 q() {
        return jc_0.s();
    }

    public jc_0 r() {
        jc_0 jc_02 = this.s();
        if (!jc_02.isInitialized()) {
            throw je_0.newUninitializedMessageException((Message)jc_02);
        }
        return jc_02;
    }

    public jc_0 s() {
        jc_0 jc_02 = new jc_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        jc_02.j = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        jc_02.k = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        jc_02.l = this.d;
        if (this.f == null) {
            if ((this.a & 8) == 8) {
                this.e = Collections.unmodifiableList(this.e);
                this.a &= 0xFFFFFFF7;
            }
            jc_02.m = this.e;
        } else {
            jc_02.m = this.f.build();
        }
        if ((n & 0x10) == 16) {
            n2 |= 8;
        }
        jc_02.n = this.h == null ? this.g : (ja_0)this.h.build();
        if ((n & 0x20) == 32) {
            n2 |= 0x10;
        }
        jc_02.o = this.i;
        jc_02.i = n2;
        this.onBuilt();
        return jc_02;
    }

    public je_0 t() {
        return (je_0)super.clone();
    }

    public je_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (je_0)super.setField(fieldDescriptor, object);
    }

    public je_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (je_0)super.clearField(fieldDescriptor);
    }

    public je_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (je_0)super.clearOneof(oneofDescriptor);
    }

    public je_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (je_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public je_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (je_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public je_0 a(Message message) {
        if (message instanceof jc_0) {
            return this.a((jc_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public je_0 a(jc_0 jc_02) {
        if (jc_02 == jc_0.s()) {
            return this;
        }
        if (jc_02.b()) {
            this.a(jc_02.c());
        }
        if (jc_02.d()) {
            this.b(jc_02.e());
        }
        if (jc_02.f()) {
            this.c(jc_02.g());
        }
        if (this.f == null) {
            if (!jc_02.m.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = jc_02.m;
                    this.a &= 0xFFFFFFF7;
                } else {
                    this.E();
                    this.e.addAll(jc_02.m);
                }
                this.onChanged();
            }
        } else if (!jc_02.m.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f.dispose();
                this.f = null;
                this.e = jc_02.m;
                this.a &= 0xFFFFFFF7;
                this.f = jc_0.w() ? this.F() : null;
            } else {
                this.f.addAllMessages(jc_02.m);
            }
        }
        if (jc_02.k()) {
            this.b(jc_02.l());
        }
        if (jc_02.n()) {
            this.g(jc_02.o());
        }
        this.b(jc_0.b(jc_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        for (int k = 0; k < this.j(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public je_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jc_0 jc_02 = null;
        try {
            jc_02 = (jc_0)jc_0.g.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jc_02 = (jc_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jc_02 != null) {
                this.a(jc_02);
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

    public je_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public je_0 u() {
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

    public je_0 b(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public je_0 v() {
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
    public int g() {
        return this.d;
    }

    public je_0 c(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public je_0 w() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    private void E() {
        if ((this.a & 8) != 8) {
            this.e = new ArrayList<iy_0>(this.e);
            this.a |= 8;
        }
    }

    @Override
    public List<iy_0> h() {
        if (this.f == null) {
            return Collections.unmodifiableList(this.e);
        }
        return this.f.getMessageList();
    }

    @Override
    public int j() {
        if (this.f == null) {
            return this.e.size();
        }
        return this.f.getCount();
    }

    @Override
    public iy_0 a(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (iy_0)this.f.getMessage(n);
    }

    public je_0 a(int n, iy_0 iy_02) {
        if (this.f == null) {
            if (iy_02 == null) {
                throw new NullPointerException();
            }
            this.E();
            this.e.set(n, iy_02);
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)iy_02);
        }
        return this;
    }

    public je_0 a(int n, ja ja2) {
        if (this.f == null) {
            this.E();
            this.e.set(n, ja2.l());
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)ja2.l());
        }
        return this;
    }

    public je_0 a(iy_0 iy_02) {
        if (this.f == null) {
            if (iy_02 == null) {
                throw new NullPointerException();
            }
            this.E();
            this.e.add(iy_02);
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)iy_02);
        }
        return this;
    }

    public je_0 b(int n, iy_0 iy_02) {
        if (this.f == null) {
            if (iy_02 == null) {
                throw new NullPointerException();
            }
            this.E();
            this.e.add(n, iy_02);
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)iy_02);
        }
        return this;
    }

    public je_0 a(ja ja2) {
        if (this.f == null) {
            this.E();
            this.e.add(ja2.l());
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)ja2.l());
        }
        return this;
    }

    public je_0 b(int n, ja ja2) {
        if (this.f == null) {
            this.E();
            this.e.add(n, ja2.l());
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)ja2.l());
        }
        return this;
    }

    public je_0 a(Iterable<? extends iy_0> iterable) {
        if (this.f == null) {
            this.E();
            AbstractMessageLite.Builder.addAll(iterable, this.e);
            this.onChanged();
        } else {
            this.f.addAllMessages(iterable);
        }
        return this;
    }

    public je_0 x() {
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFF7;
            this.onChanged();
        } else {
            this.f.clear();
        }
        return this;
    }

    public je_0 d(int n) {
        if (this.f == null) {
            this.E();
            this.e.remove(n);
            this.onChanged();
        } else {
            this.f.remove(n);
        }
        return this;
    }

    public ja e(int n) {
        return (ja)this.F().getBuilder(n);
    }

    @Override
    public jb_0 b(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (jb_0)this.f.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jb_0> i() {
        if (this.f != null) {
            return this.f.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.e);
    }

    public ja y() {
        return (ja)this.F().addBuilder((AbstractMessage)iy_0.m());
    }

    public ja f(int n) {
        return (ja)this.F().addBuilder(n, (AbstractMessage)iy_0.m());
    }

    public List<ja> z() {
        return this.F().getBuilderList();
    }

    private RepeatedFieldBuilderV3<iy_0, ja, jb_0> F() {
        if (this.f == null) {
            this.f = new RepeatedFieldBuilderV3(this.e, (this.a & 8) == 8, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public ja_0 l() {
        if (this.h == null) {
            return this.g == null ? ja_0.s() : this.g;
        }
        return (ja_0)this.h.getMessage();
    }

    public je_0 a(ja_0 ja_02) {
        if (this.h == null) {
            if (ja_02 == null) {
                throw new NullPointerException();
            }
            this.g = ja_02;
            this.onChanged();
        } else {
            this.h.setMessage((AbstractMessage)ja_02);
        }
        this.a |= 0x10;
        return this;
    }

    public je_0 a(jC jC2) {
        if (this.h == null) {
            this.g = jC2.r();
            this.onChanged();
        } else {
            this.h.setMessage((AbstractMessage)jC2.r());
        }
        this.a |= 0x10;
        return this;
    }

    public je_0 b(ja_0 ja_02) {
        if (this.h == null) {
            this.g = (this.a & 0x10) == 16 && this.g != null && this.g != ja_0.s() ? ja_0.a(this.g).a(ja_02).s() : ja_02;
            this.onChanged();
        } else {
            this.h.mergeFrom((AbstractMessage)ja_02);
        }
        this.a |= 0x10;
        return this;
    }

    public je_0 A() {
        if (this.h == null) {
            this.g = null;
            this.onChanged();
        } else {
            this.h.clear();
        }
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public jC B() {
        this.a |= 0x10;
        this.onChanged();
        return (jC)this.G().getBuilder();
    }

    @Override
    public jD m() {
        if (this.h != null) {
            return (jD)this.h.getMessageOrBuilder();
        }
        return this.g == null ? ja_0.s() : this.g;
    }

    private SingleFieldBuilderV3<ja_0, jC, jD> G() {
        if (this.h == null) {
            this.h = new SingleFieldBuilderV3((AbstractMessage)this.l(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.g = null;
        }
        return this.h;
    }

    @Override
    public boolean n() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public int o() {
        return this.i;
    }

    public je_0 g(int n) {
        this.a |= 0x20;
        this.i = n;
        this.onChanged();
        return this;
    }

    public je_0 C() {
        this.a &= 0xFFFFFFDF;
        this.i = 0;
        this.onChanged();
        return this;
    }

    public final je_0 a(UnknownFieldSet unknownFieldSet) {
        return (je_0)super.setUnknownFields(unknownFieldSet);
    }

    public final je_0 b(UnknownFieldSet unknownFieldSet) {
        return (je_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.p();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.t();
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
        return this.p();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.t();
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
        return this.t();
    }

    public /* synthetic */ Message buildPartial() {
        return this.s();
    }

    public /* synthetic */ Message build() {
        return this.r();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.t();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.s();
    }

    public /* synthetic */ MessageLite build() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.p();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.t();
    }

    public /* synthetic */ Object clone() {
        return this.t();
    }
}

