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

/*
 * Renamed from zV
 */
public final class zv_2
extends GeneratedMessageV3.Builder<zv_2>
implements zw_2 {
    private int a;
    private List<zq_2> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<zq_2, zs_2, zx_2> c;

    public static final Descriptors.Descriptor a() {
        return zo_2.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zo_2.b.ensureFieldAccessorsInitialized(zt_2.class, zv_2.class);
    }

    zv_2() {
        this.m();
    }

    zv_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (zt_2.k()) {
            this.o();
        }
    }

    public zv_2 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zo_2.a;
    }

    public zt_2 f() {
        return zt_2.h();
    }

    public zt_2 g() {
        zt_2 zt_22 = this.h();
        if (!zt_22.isInitialized()) {
            throw zv_2.newUninitializedMessageException((Message)zt_22);
        }
        return zt_22;
    }

    public zt_2 h() {
        zt_2 zt_22 = new zt_2(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            zt_22.d = this.b;
        } else {
            zt_22.d = this.c.build();
        }
        this.onBuilt();
        return zt_22;
    }

    public zv_2 i() {
        return (zv_2)super.clone();
    }

    public zv_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zv_2)super.setField(fieldDescriptor, object);
    }

    public zv_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zv_2)super.clearField(fieldDescriptor);
    }

    public zv_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zv_2)super.clearOneof(oneofDescriptor);
    }

    public zv_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zv_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zv_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zv_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public zv_2 a(Message message) {
        if (message instanceof zt_2) {
            return this.a((zt_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zv_2 a(zt_2 zt_22) {
        if (zt_22 == zt_2.h()) {
            return this;
        }
        if (this.c == null) {
            if (!zt_22.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = zt_22.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(zt_22.d);
                }
                this.onChanged();
            }
        } else if (!zt_22.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = zt_22.d;
                this.a &= 0xFFFFFFFE;
                this.c = zt_2.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(zt_22.d);
            }
        }
        this.b(zt_2.b(zt_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public zv_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zt_2 zt_22 = null;
        try {
            zt_22 = (zt_2)zt_2.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zt_22 = (zt_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zt_22 != null) {
                this.a(zt_22);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<zq_2>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<zq_2> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public zq_2 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (zq_2)this.c.getMessage(n);
    }

    public zv_2 a(int n, zq_2 zq_22) {
        if (this.c == null) {
            if (zq_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, zq_22);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)zq_22);
        }
        return this;
    }

    public zv_2 a(int n, zs_2 zs_22) {
        if (this.c == null) {
            this.n();
            this.b.set(n, zs_22.j());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)zs_22.j());
        }
        return this;
    }

    public zv_2 a(zq_2 zq_22) {
        if (this.c == null) {
            if (zq_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(zq_22);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)zq_22);
        }
        return this;
    }

    public zv_2 b(int n, zq_2 zq_22) {
        if (this.c == null) {
            if (zq_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, zq_22);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)zq_22);
        }
        return this;
    }

    public zv_2 a(zs_2 zs_22) {
        if (this.c == null) {
            this.n();
            this.b.add(zs_22.j());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)zs_22.j());
        }
        return this;
    }

    public zv_2 b(int n, zs_2 zs_22) {
        if (this.c == null) {
            this.n();
            this.b.add(n, zs_22.j());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)zs_22.j());
        }
        return this;
    }

    public zv_2 a(Iterable<? extends zq_2> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public zv_2 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public zv_2 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public zs_2 d(int n) {
        return (zs_2)this.o().getBuilder(n);
    }

    @Override
    public zx_2 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (zx_2)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends zx_2> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public zs_2 k() {
        return (zs_2)this.o().addBuilder((AbstractMessage)zq_2.k());
    }

    public zs_2 e(int n) {
        return (zs_2)this.o().addBuilder(n, (AbstractMessage)zq_2.k());
    }

    public List<zs_2> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<zq_2, zs_2, zx_2> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final zv_2 a(UnknownFieldSet unknownFieldSet) {
        return (zv_2)super.setUnknownFields(unknownFieldSet);
    }

    public final zv_2 b(UnknownFieldSet unknownFieldSet) {
        return (zv_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

