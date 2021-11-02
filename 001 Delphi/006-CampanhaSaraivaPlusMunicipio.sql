USE [dbretaguarda]
GO

/****** Object:  Table [dbo].[CampanhaSaraivaPlusMunicipio]    Script Date: 22/11/2016 10:43:55 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[CampanhaSaraivaPlusMunicipio](
	[CSM_ID] [int] IDENTITY(1,1) NOT NULL,
	[CSM_MNC_CodMunicipio] [int] NOT NULL,
	[CSM_CSP_ID] [int] NOT NULL,
 CONSTRAINT [PK_CampanhaSaraivaPlusMunicipio] PRIMARY KEY CLUSTERED 
(
	[CSM_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusMunicipio]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusMunicipio_CampanhaSaraivaPlus] FOREIGN KEY([CSM_CSP_ID])
REFERENCES [dbo].[CampanhaSaraivaPlus] ([CSP_ID])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusMunicipio] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusMunicipio_CampanhaSaraivaPlus]
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusMunicipio]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusMunicipio_MunicipioIBGE] FOREIGN KEY([CSM_MNC_CodMunicipio])
REFERENCES [dbo].[MunicipioIBGE] ([MNC_CodMunicipio])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusMunicipio] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusMunicipio_MunicipioIBGE]
GO


