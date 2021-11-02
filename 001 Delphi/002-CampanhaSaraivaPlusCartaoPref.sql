USE [dbretaguarda]
GO

/****** Object:  Table [dbo].[CampanhaSaraivaPlusCartaoPref]    Script Date: 22/11/2016 10:41:59 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[CampanhaSaraivaPlusCartaoPref](
	[CSC_ID] [int] IDENTITY(1,1) NOT NULL,
	[CSC_CAP_NroCartao] [int] NOT NULL,
	[CSC_CSP_ID] [int] NOT NULL,
 CONSTRAINT [PK_CampanhaSaraivaPlusCartaoPref] PRIMARY KEY CLUSTERED 
(
	[CSC_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCartaoPref]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusCartaoPref_CampanhaSaraivaPlus] FOREIGN KEY([CSC_CSP_ID])
REFERENCES [dbo].[CampanhaSaraivaPlus] ([CSP_ID])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCartaoPref] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusCartaoPref_CampanhaSaraivaPlus]
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCartaoPref]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusCartaoPref_CartaoPref] FOREIGN KEY([CSC_CAP_NroCartao])
REFERENCES [dbo].[CartaoPref] ([CAP_NroCartao])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCartaoPref] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusCartaoPref_CartaoPref]
GO


