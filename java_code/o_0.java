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
 * Renamed from o
 */
public final class o_0
extends GeneratedMessageV3.Builder<o_0>
implements p {
    private j a = null;
    private SingleFieldBuilderV3<j, l_0, u_0> b;

    public static final Descriptors.Descriptor a() {
        return g_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.f.ensureFieldAccessorsInitialized(m_0.class, o_0.class);
    }

    o_0() {
        this.l();
    }

    o_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (m_0.k()) {
            // empty if block
        }
    }

    public o_0 e() {
        super.clear();
        if (this.b == null) {
            this.a = null;
        } else {
            this.a = null;
            this.b = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.e;
    }

    public m_0 f() {
        return m_0.h();
    }

    public m_0 g() {
        m_0 m_02 = this.h();
        if (!m_02.isInitialized()) {
            throw o_0.newUninitializedMessageException((Message)m_02);
        }
        return m_02;
    }

    public m_0 h() {
        m_0 m_02 = new m_0(this);
        m_02.c = this.b == null ? this.a : (j)this.b.build();
        this.onBuilt();
        return m_02;
    }

    public o_0 i() {
        return (o_0)super.clone();
    }

    public o_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (o_0)super.setField(fieldDescriptor, object);
    }

    public o_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (o_0)super.clearField(fieldDescriptor);
    }

    public o_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (o_0)super.clearOneof(oneofDescriptor);
    }

    public o_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (o_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public o_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (o_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public o_0 a(Message message) {
        if (message instanceof m_0) {
            return this.a((m_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public o_0 a(m_0 m_02) {
        if (m_02 == m_0.h()) {
            return this;
        }
        if (m_02.b()) {
            this.b(m_02.c());
        }
        this.b(m_0.b(m_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public o_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m_0 m_02 = null;
        try {
            m_02 = (m_0)m_0.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            m_02 = (m_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (m_02 != null) {
                this.a(m_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return this.b != null || this.a != null;
    }

    @Override
    public j c() {
        if (this.b == null) {
            return this.a == null ? j.o() : this.a;
        }
        return (j)this.b.getMessage();
    }

    public o_0 a(j j2) {
        if (this.b == null) {
            if (j2 == null) {
                throw new NullPointerException();
            }
            this.a = j2;
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)j2);
        }
        return this;
    }

    public o_0 a(l_0 l_02) {
        if (this.b == null) {
            this.a = l_02.n();
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)l_02.n());
        }
        return this;
    }

    public o_0 b(j j2) {
        if (this.b == null) {
            this.a = this.a != null ? j.a(this.a).a(j2).o() : j2;
            this.onChanged();
        } else {
            this.b.mergeFrom((AbstractMessage)j2);
        }
        return this;
    }

    public o_0 j() {
        if (this.b == null) {
            this.a = null;
            this.onChanged();
        } else {
            this.a = null;
            this.b = null;
        }
        return this;
    }

    public l_0 k() {
        this.onChanged();
        return (l_0)this.m().getBuilder();
    }

    @Override
    public u_0 d() {
        if (this.b != null) {
            return (u_0)this.b.getMessageOrBuilder();
        }
        return this.a == null ? j.o() : this.a;
    }

    private SingleFieldBuilderV3<j, l_0, u_0> m() {
        if (this.b == null) {
            this.b = new SingleFieldBuilderV3((AbstractMessage)this.c(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.a = null;
        }
        return this.b;
    }

    public final o_0 a(UnknownFieldSet unknownFieldSet) {
        return (o_0)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final o_0 b(UnknownFieldSet unknownFieldSet) {
        return (o_0)super.mergeUnknownFields(unknownFieldSet);
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

