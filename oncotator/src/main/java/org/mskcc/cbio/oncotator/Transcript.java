/** Copyright (c) 2012 Memorial Sloan-Kettering Cancer Center.
 **
 ** This library is free software; you can redistribute it and/or modify it
 ** under the terms of the GNU Lesser General Public License as published
 ** by the Free Software Foundation; either version 2.1 of the License, or
 ** any later version.
 **
 ** This library is distributed in the hope that it will be useful, but
 ** WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 ** MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 ** documentation provided hereunder is on an "as is" basis, and
 ** Memorial Sloan-Kettering Cancer Center
 ** has no obligations to provide maintenance, support,
 ** updates, enhancements or modifications.  In no event shall
 ** Memorial Sloan-Kettering Cancer Center
 ** be liable to any party for direct, indirect, special,
 ** incidental or consequential damages, including lost profits, arising
 ** out of the use of this software and its documentation, even if
 ** Memorial Sloan-Kettering Cancer Center
 ** has been advised of the possibility of such damage.  See
 ** the GNU Lesser General Public License for more details.
 **
 ** You should have received a copy of the GNU Lesser General Public License
 ** along with this library; if not, write to the Free Software Foundation,
 ** Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
 **/

package org.mskcc.cbio.oncotator;

/**
 * Represents a single Transcript. Designed to be part of
 * an OncotatorRecord instance.
 *
 * @author Selcuk Onur Sumer
 */
public class Transcript
{
	private String gene;
	private String proteinChange;
	private String variantClassification;
	private Integer exonAffected;
	private String refseqMrnaId;
	private String refseqProtId;
	private String uniprotName;
	private String uniprotAccession;
	private String codonChange;
	private String transcriptChange;
	private Integer proteinPosStart;
	private Integer proteinPosEnd;

	public String getProteinChange()
	{
		return proteinChange;
	}

	public void setProteinChange(String proteinChange)
	{
		this.proteinChange = proteinChange;
	}

	public String getVariantClassification()
	{
		return variantClassification;
	}

	public void setVariantClassification(String variantClassification)
	{
		this.variantClassification = variantClassification;
	}

	public String getGene()
	{
		return gene;
	}

	public void setGene(String gene)
	{
		this.gene = gene;
	}

	public Integer getExonAffected()
	{
		return exonAffected;
	}

	public void setExonAffected(Integer exonAffected)
	{
		this.exonAffected = exonAffected;
	}

	public String getRefseqMrnaId()
	{
		return refseqMrnaId;
	}

	public void setRefseqMrnaId(String refseqMrnaId)
	{
		this.refseqMrnaId = refseqMrnaId;
	}

	public String getRefseqProtId()
	{
		return refseqProtId;
	}

	public void setRefseqProtId(String refseqProtId)
	{
		this.refseqProtId = refseqProtId;
	}

	public String getUniprotAccession()
	{
		return uniprotAccession;
	}

	public void setUniprotAccession(String uniprotAccession)
	{
		this.uniprotAccession = uniprotAccession;
	}

	public String getUniprotName()
	{
		return uniprotName;
	}

	public void setUniprotName(String uniprotName)
	{
		this.uniprotName = uniprotName;
	}

	public String getCodonChange()
	{
		return codonChange;
	}

	public void setCodonChange(String codonChange)
	{
		this.codonChange = codonChange;
	}

	public String getTranscriptChange()
	{
		return transcriptChange;
	}

	public void setTranscriptChange(String transcriptChange)
	{
		this.transcriptChange = transcriptChange;
	}

	public Integer getProteinPosStart()
	{
		return proteinPosStart;
	}

	public void setProteinPosStart(Integer proteinPosStart)
	{
		this.proteinPosStart = proteinPosStart;
	}

	public Integer getProteinPosEnd()
	{
		return proteinPosEnd;
	}

	public void setProteinPosEnd(Integer proteinPosEnd)
	{
		this.proteinPosEnd = proteinPosEnd;
	}
}
