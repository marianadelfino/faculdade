USE [dbretaguarda]
GO

/****** Object:  Table [dbo].[CampanhaSaraivaPlusProduto]    Script Date: 22/11/2016 10:44:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[CampanhaSaraivaPlusProduto](
	[CSR_ID] [int] IDENTITY(1,1) NOT NULL,
	[CSR_PRO_ID] [int] NOT NULL,
	[CSR_CSP_ID] [int] NOT NULL,
	[CSR_Qtde] [int] NOT NULL,
 CONSTRAINT [PK_CampanhaSaraivaPlusProduto] PRIMARY KEY CLUSTERED 
(
	[CSR_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusProduto]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusProduto_CampanhaSaraivaPlus] FOREIGN KEY([CSR_CSP_ID])
REFERENCES [dbo].[CampanhaSaraivaPlus] ([CSP_ID])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusProduto] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusProduto_CampanhaSaraivaPlus]
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusProduto]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusProduto_Produto] FOREIGN KEY([CSR_PRO_ID])
REFERENCES [dbo].[Produto] ([PRO_Id])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusProduto] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusProduto_Produto]
GO


