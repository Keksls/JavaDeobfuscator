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

public final class AS
extends GeneratedMessageV3.Builder<AS>
implements AX {
    private int a;
    private List<AT> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<AT, AV, AW> c;

    public static final Descriptors.Descriptor a() {
        return AO.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.b.ensureFieldAccessorsInitialized(AQ.class, AS.class);
    }

    AS() {
        this.m();
    }

    AS(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (AQ.k()) {
            this.o();
        }
    }

    public AS e() {
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
        return AO.a;
    }

    public AQ f() {
        return AQ.h();
    }

    public AQ g() {
        AQ aQ = this.h();
        if (!aQ.isInitialized()) {
            throw AS.newUninitializedMessageException((Message)aQ);
        }
        return aQ;
    }

    public AQ h() {
        AQ aQ = new AQ(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            aQ.d = this.b;
        } else {
            aQ.d = this.c.build();
        }
        this.onBuilt();
        return aQ;
    }

    public AS i() {
        return (AS)super.clone();
    }

    public AS a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AS)super.setField(fieldDescriptor, object);
    }

    public AS a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (AS)super.clearField(fieldDescriptor);
    }

    public AS a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (AS)super.clearOneof(oneofDescriptor);
    }

    public AS a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (AS)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public AS b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AS)super.addRepeatedField(fieldDescriptor, object);
    }

    public AS a(Message message) {
        if (message instanceof AQ) {
            return this.a((AQ)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public AS a(AQ aQ) {
        if (aQ == AQ.h()) {
            return this;
        }
        if (this.c == null) {
            if (!aQ.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = aQ.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(aQ.d);
                }
                this.onChanged();
            }
        } else if (!aQ.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = aQ.d;
                this.a &= 0xFFFFFFFE;
                this.c = AQ.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(aQ.d);
            }
        }
        this.b(AQ.b(aQ));
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

    public AS a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        AQ aQ = null;
        try {
            aQ = (AQ)AQ.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aQ = (AQ)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aQ != null) {
                this.a(aQ);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<AT>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<AT> b() {
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
    public AT a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (AT)this.c.getMessage(n);
    }

    public AS a(int n, AT aT) {
        if (this.c == null) {
            if (aT == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, aT);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)aT);
        }
        return this;
    }

    public AS a(int n, AV aV) {
        if (this.c == null) {
            this.n();
            this.b.set(n, aV.i());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)aV.i());
        }
        return this;
    }

    public AS a(AT aT) {
        if (this.c == null) {
            if (aT == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(aT);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)aT);
        }
        return this;
    }

    public AS b(int n, AT aT) {
        if (this.c == null) {
            if (aT == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, aT);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)aT);
        }
        return this;
    }

    public AS a(AV aV) {
        if (this.c == null) {
            this.n();
            this.b.add(aV.i());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)aV.i());
        }
        return this;
    }

    public AS b(int n, AV aV) {
        if (this.c == null) {
            this.n();
            this.b.add(n, aV.i());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)aV.i());
        }
        return this;
    }

    public AS a(Iterable<? extends AT> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public AS j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public AS c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public AV d(int n) {
        return (AV)this.o().getBuilder(n);
    }

    @Override
    public AW b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (AW)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends AW> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public AV k() {
        return (AV)this.o().addBuilder((AbstractMessage)AT.j());
    }

    public AV e(int n) {
        return (AV)this.o().addBuilder(n, (AbstractMessage)AT.j());
    }

    public List<AV> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<AT, AV, AW> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final AS a(UnknownFieldSet unknownFieldSet) {
        return (AS)super.setUnknownFields(unknownFieldSet);
    }

    public final AS b(UnknownFieldSet unknownFieldSet) {
        return (AS)super.mergeUnknownFields(unknownFieldSet);
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

