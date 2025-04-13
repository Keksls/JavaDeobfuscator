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
 * Renamed from bX
 */
public final class bx_2
extends GeneratedMessageV3.Builder<bx_2>
implements by_2 {
    private long a;
    private bl_1 b = null;
    private SingleFieldBuilderV3<bl_1, bn_2, ba_2> c;

    public static final Descriptors.Descriptor a() {
        return ak_2.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.h.ensureFieldAccessorsInitialized(bv_2.class, bx_2.class);
    }

    bx_2() {
        this.n();
    }

    bx_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.n();
    }

    private void n() {
        if (bv_2.l()) {
            // empty if block
        }
    }

    public bx_2 f() {
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
        return ak_2.g;
    }

    public bv_2 g() {
        return bv_2.i();
    }

    public bv_2 h() {
        bv_2 bv_22 = this.i();
        if (!bv_22.isInitialized()) {
            throw bx_2.newUninitializedMessageException((Message)bv_22);
        }
        return bv_22;
    }

    public bv_2 i() {
        bv_2 bv_22 = new bv_2(this);
        bv_22.d = this.a;
        bv_22.e = this.c == null ? this.b : (bl_1)this.c.build();
        this.onBuilt();
        return bv_22;
    }

    public bx_2 j() {
        return (bx_2)super.clone();
    }

    public bx_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bx_2)super.setField(fieldDescriptor, object);
    }

    public bx_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bx_2)super.clearField(fieldDescriptor);
    }

    public bx_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bx_2)super.clearOneof(oneofDescriptor);
    }

    public bx_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bx_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bx_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bx_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bx_2 a(Message message) {
        if (message instanceof bv_2) {
            return this.a((bv_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bx_2 a(bv_2 bv_22) {
        if (bv_22 == bv_2.i()) {
            return this;
        }
        if (bv_22.b() != 0L) {
            this.a(bv_22.b());
        }
        if (bv_22.c()) {
            this.b(bv_22.d());
        }
        this.b(bv_2.b(bv_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bx_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bv_2 bv_22 = null;
        try {
            bv_22 = (bv_2)bv_2.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bv_22 = (bv_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bv_22 != null) {
                this.a(bv_22);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public bx_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public bx_2 k() {
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

    public bx_2 a(bl_1 bl_12) {
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

    public bx_2 a(bn_2 bn_22) {
        if (this.c == null) {
            this.b = bn_22.l();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)bn_22.l());
        }
        return this;
    }

    public bx_2 b(bl_1 bl_12) {
        if (this.c == null) {
            this.b = this.b != null ? bl_1.a(this.b).a(bl_12).m() : bl_12;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)bl_12);
        }
        return this;
    }

    public bx_2 l() {
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

    public final bx_2 a(UnknownFieldSet unknownFieldSet) {
        return (bx_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final bx_2 b(UnknownFieldSet unknownFieldSet) {
        return (bx_2)super.mergeUnknownFields(unknownFieldSet);
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

