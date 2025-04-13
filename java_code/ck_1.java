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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from cK
 */
public final class ck_1
extends GeneratedMessageV3.Builder<ck_1>
implements cl_1 {
    private long a;
    private bl_1 b = null;
    private SingleFieldBuilderV3<bl_1, bn_2, ba_2> c;

    public static final Descriptors.Descriptor a() {
        return ak_2.G;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.H.ensureFieldAccessorsInitialized(ci_1.class, ck_1.class);
    }

    ck_1() {
        this.n();
    }

    ck_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.n();
    }

    private void n() {
        if (ci_1.l()) {
            // empty if block
        }
    }

    public ck_1 f() {
        super.clear();
        this.a = 0L;
        if (this.c == null) {
            this.b = null;
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.G;
    }

    public ci_1 g() {
        return ci_1.i();
    }

    public ci_1 h() {
        ci_1 ci_12 = this.i();
        if (!ci_12.isInitialized()) {
            throw ck_1.newUninitializedMessageException((Message)ci_12);
        }
        return ci_12;
    }

    public ci_1 i() {
        ci_1 ci_12 = new ci_1(this);
        ci_12.d = this.a;
        ci_12.e = this.c == null ? this.b : (bl_1)this.c.build();
        this.onBuilt();
        return ci_12;
    }

    public ck_1 j() {
        return (ck_1)super.clone();
    }

    public ck_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ck_1)super.setField(fieldDescriptor, object);
    }

    public ck_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ck_1)super.clearField(fieldDescriptor);
    }

    public ck_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ck_1)super.clearOneof(oneofDescriptor);
    }

    public ck_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ck_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ck_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ck_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ck_1 a(Message message) {
        if (message instanceof ci_1) {
            return this.a((ci_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ck_1 a(ci_1 ci_12) {
        if (ci_12 == ci_1.i()) {
            return this;
        }
        if (ci_12.b() != 0L) {
            this.a(ci_12.b());
        }
        if (ci_12.c()) {
            this.b(ci_12.d());
        }
        this.b(ci_1.b(ci_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ck_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ci_1 ci_12 = null;
        try {
            ci_12 = (ci_1)ci_1.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ci_12 = (ci_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ci_12 != null) {
                this.a(ci_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public ck_1 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public ck_1 k() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean c() {
        return this.c != null || this.b != null;
    }

    @Override
    public bl_1 d() {
        if (this.c == null) {
            return this.b == null ? bl_1.m() : this.b;
        }
        return (bl_1)this.c.getMessage();
    }

    public ck_1 a(bl_1 bl_12) {
        if (this.c == null) {
            if (bl_12 == null) {
                throw new NullPointerException();
            }
            this.b = bl_12;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)bl_12);
        }
        return this;
    }

    public ck_1 a(bn_2 bn_22) {
        if (this.c == null) {
            this.b = bn_22.l();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)bn_22.l());
        }
        return this;
    }

    public ck_1 b(bl_1 bl_12) {
        if (this.c == null) {
            this.b = this.b != null ? bl_1.a(this.b).a(bl_12).m() : bl_12;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)bl_12);
        }
        return this;
    }

    public ck_1 l() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public bn_2 m() {
        this.onChanged();
        return (bn_2)this.o().getBuilder();
    }

    @Override
    public ba_2 e() {
        if (this.c != null) {
            return (ba_2)this.c.getMessageOrBuilder();
        }
        return this.b == null ? bl_1.m() : this.b;
    }

    private SingleFieldBuilderV3<bl_1, bn_2, ba_2> o() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.d(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final ck_1 a(UnknownFieldSet unknownFieldSet) {
        return (ck_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final ck_1 b(UnknownFieldSet unknownFieldSet) {
        return (ck_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
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
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
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
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}

