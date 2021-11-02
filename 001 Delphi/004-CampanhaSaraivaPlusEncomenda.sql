USE [dbretaguarda]
GO

/****** Object:  Table [dbo].[CampanhaSaraivaPlusEncomenda]    Script Date: 22/11/2016 10:43:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[CampanhaSaraivaPlusEncomenda](
	[CSE_ID] [int] IDENTITY(1,1) NOT NULL,
	[CSE_CSP_ID] [int] NOT NULL,
	[CSE_hrInicialCompra] [smalldatetime] NULL,
	[CSE_hrFinalCompra] [smalldatetime] NULL,
	[CSE_ValorMinimo] [decimal](14, 4) NULL,
	[CSE_CRB_ID] [int] NULL,
 CONSTRAINT [PK_CampanhaSaraivaPlusEncomenda] PRIMARY KEY CLUSTERED 
(
	[CSE_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusEncomenda]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusEncomenda_CampanhaSaraivaPlus] FOREIGN KEY([CSE_CSP_ID])
REFERENCES [dbo].[CampanhaSaraivaPlus] ([CSP_ID])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusEncomenda] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusEncomenda_CampanhaSaraivaPlus]
GO


