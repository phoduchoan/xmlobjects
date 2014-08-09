/*
 * Copyright (C) 2014 Marten Gajda <marten@dmfs.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package org.dmfs.xmlobjects.serializer;

import java.io.IOException;
import java.net.URI;

import org.dmfs.xmlobjects.XmlElementDescriptor;
import org.dmfs.xmlobjects.serializer.XmlObjectSerializer.IXmlChildWriter;


/**
 * An {@link IXmlObjectSerializer} for {@link URI}s.
 * 
 * @author Marten Gajda <marten@dmfs.org>
 */
public class UriObjectSerializer extends AbstractObjectSerializer<URI>
{
	/**
	 * An instance of {@link UriObjectSerializer}.
	 */
	public final static UriObjectSerializer INSTANCE = new UriObjectSerializer();


	@Override
	public void writeChildren(XmlElementDescriptor<URI> descriptor, URI object, IXmlChildWriter childWriter, SerializerContext context)
		throws SerializerException, IOException
	{
		childWriter.writeText(object.toASCIIString());
	}
}
