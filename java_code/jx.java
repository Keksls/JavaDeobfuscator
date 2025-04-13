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
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jx
extends GeneratedMessageV3.Builder<jx>
implements jy {
    private int a;
    private long b;
    private List<iy_0> c = Collections.emptyList();
    private RepeatedFieldBuilderV3<iy_0, ja, jb_0> d;

    public static final Descriptors.Descriptor a() {
        return iw_0.o;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.p.ensureFieldAccessorsInitialized(jv.class, jx.class);
    }

    jx() {
        this.p();
    }

    jx(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.p();
    }

    private void p() {
        if (jv.m()) {
            this.r();
        }
    }

    public jx g() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.d.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iw_0.o;
    }

    public jv h() {
        return jv.j();
    }

    public jv i() {
        jv jv2 = this.j();
        if (!jv2.isInitialized()) {
            throw jx.newUninitializedMessageException((Message)jv2);
        }
        return jv2;
    }

    public jv j() {
        jv jv2 = new jv(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        jv2.f = this.b;
        if (this.d == null) {
            if ((this.a & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
                this.a &= 0xFFFFFFFD;
            }
            jv2.g = this.c;
        } else {
            jv2.g = this.d.build();
        }
        jv2.e = n2;
        this.onBuilt();
        return jv2;
    }

    public jx k() {
        return (jx)super.clone();
    }

    public jx a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jx)super.setField(fieldDescriptor, object);
    }

    public jx a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jx)super.clearField(fieldDescriptor);
    }

    public jx a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jx)super.clearOneof(oneofDescriptor);
    }

    public jx a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jx)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jx b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jx)super.addRepeatedField(fieldDescriptor, object);
    }

    public jx a(Message message) {
        if (message instanceof jv) {
            return this.a((jv)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jx a(jv jv2) {
        if (jv2 == jv.j()) {
            return this;
        }
        if (jv2.b()) {
            this.a(jv2.c());
        }
        if (this.d == null) {
            if (!jv2.g.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = jv2.g;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.q();
                    this.c.addAll(jv2.g);
                }
                this.onChanged();
            }
        } else if (!jv2.g.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d.dispose();
                this.d = null;
                this.c = jv2.g;
                this.a &= 0xFFFFFFFD;
                this.d = jv.n() ? this.r() : null;
            } else {
                this.d.addAllMessages(jv2.g);
            }
        }
        this.b(jv.b(jv2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public jx a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jv jv2 = null;
        try {
            jv2 = (jv)jv.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jv2 = (jv)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jv2 != null) {
                this.a(jv2);
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

    public jx a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public jx l() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    private void q() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<iy_0>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<iy_0> d() {
        if (this.d == null) {
            return Collections.unmodifiableList(this.c);
        }
        return this.d.getMessageList();
    }

    @Override
    public int f() {
        if (this.d == null) {
            return this.c.size();
        }
        return this.d.getCount();
    }

    @Override
    public iy_0 a(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (iy_0)this.d.getMessage(n);
    }

    public jx a(int n, iy_0 iy_02) {
        if (this.d == null) {
            if (iy_02 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.set(n, iy_02);
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)iy_02);
        }
        return this;
    }

    public jx a(int n, ja ja2) {
        if (this.d == null) {
            this.q();
            this.c.set(n, ja2.l());
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)ja2.l());
        }
        return this;
    }

    public jx a(iy_0 iy_02) {
        if (this.d == null) {
            if (iy_02 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.add(iy_02);
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)iy_02);
        }
        return this;
    }

    public jx b(int n, iy_0 iy_02) {
        if (this.d == null) {
            if (iy_02 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.add(n, iy_02);
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)iy_02);
        }
        return this;
    }

    public jx a(ja ja2) {
        if (this.d == null) {
            this.q();
            this.c.add(ja2.l());
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)ja2.l());
        }
        return this;
    }

    public jx b(int n, ja ja2) {
        if (this.d == null) {
            this.q();
            this.c.add(n, ja2.l());
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)ja2.l());
        }
        return this;
    }

    public jx a(Iterable<? extends iy_0> iterable) {
        if (this.d == null) {
            this.q();
            AbstractMessageLite.Builder.addAll(iterable, this.c);
            this.onChanged();
        } else {
            this.d.addAllMessages(iterable);
        }
        return this;
    }

    public jx m() {
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.d.clear();
        }
        return this;
    }

    public jx c(int n) {
        if (this.d == null) {
            this.q();
            this.c.remove(n);
            this.onChanged();
        } else {
            this.d.remove(n);
        }
        return this;
    }

    public ja d(int n) {
        return (ja)this.r().getBuilder(n);
    }

    @Override
    public jb_0 b(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (jb_0)this.d.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jb_0> e() {
        if (this.d != null) {
            return this.d.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.c);
    }

    public ja n() {
        return (ja)this.r().addBuilder((AbstractMessage)iy_0.m());
    }

    public ja e(int n) {
        return (ja)this.r().addBuilder(n, (AbstractMessage)iy_0.m());
    }

    public List<ja> o() {
        return this.r().getBuilderList();
    }

    private RepeatedFieldBuilderV3<iy_0, ja, jb_0> r() {
        if (this.d == null) {
            this.d = new RepeatedFieldBuilderV3(this.c, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final jx a(UnknownFieldSet unknownFieldSet) {
        return (jx)super.setUnknownFields(unknownFieldSet);
    }

    public final jx b(UnknownFieldSet unknownFieldSet) {
        return (jx)super.mergeUnknownFields(unknownFieldSet);
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
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
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
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
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
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

